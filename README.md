<h6>
CS-324-2: Introduction to the Design of Algorithms <br>
Spring 2021 <br>
Northeastern Illinois University <br>
Homework #6 <br>
Due Date: 03/31/21 at 9:00 p.m. <br>
Greedy Algorithms, Part I
</h6>

#### Getting Started

1. Clone the assignment to your computer.
2. Go to File > Project Structure. Under Project Settings, click on Project and verify that the Project SDK is
set to JDK 11 or higher.  If it is not, select the correct SDK from the drop-down. 
3. Go to File > Settings (Mac: IntelliJ IDEA > Preferences). Under Build, Execution, Deployment and under Build
Tools, click Gradle. Make sure Build and run using: and Run tests using: are set to Gradle. Make sure Use Gradle from:
is set to 'gradle-wrapper.properties' file. And make sure Gradle JVM is set to JDK 11 or higher.
4. Project SDK and Gradle JVM should be set to the same Java version.

#### Submitting your assignment

1. Make sure that all your code is committed to GitHub and that all the code analyzers and unit tests
pass.
2. You will have the opportunity to make corrections on any code that is a complete/valid attempt at 
solving the problem. Code that does not compile or run does not constitute a complete/valid attempt.

#### Running Tests and Code Analyzers

1. To run unit tests: Click the green arrow to the left of each header to run the tests individually or click the 
   green arrow to the left of the class header to run all the tests. If they do not pass, your code is incorrect.
2. To run code analyzers: On the right side of IntelliJ, click Gradle, expand Tasks > other. 
    - Double-click the checkstyleMain task to run it.
    - Double-click on the pmdMain task in the same panel. 
    - If there are errors: You can click the link provided, then choose your browser of choice at the top-right corner to view the 
      error description or in the bottom left panel, click the middle red exclamation point to view the error.
      Fix the issue and rerun checkstyleMain, repeat if necessary.
3. Note that while having all the unit tests and pmd/checkstyle tests is the first step for your code to be
   considered correct, this does not necessarily mean the algorithm is correct.
4. Once unit tests and code analyzers all pass, open GitHub Desktop. You will be able to see the files that 
   have been changed in the left panel. Enter a summary in the bottom left then click "Commit to main". Then click Push 
   Origin in the right panel at the top.
5. If you go to your GitHub account and go to the Actions tab for this assignment repository, you can see the 
   workflow running.

#### Coding Rules

1. Unless specified in the instructions, you may not use any String variables or any String methods.
2. Unless specified in the instructions, you may not use any built-in Array methods.
3. Unless specified in the instructions, you may not import anything from the Java API.
4. Unless specified in the instructions, you may not use any Java methods that copy or manipulate arrays.
4. Reminder: All code must be your own work.

### Problem 1

1. In the `main/java/problem1` directory, review the file named `Box.java`. This class represents a 
   box that can hold a particular volume (in cubic feet). It also contains an optional variable named
   `available` that represents the number of boxes of that volume that are available. In addition, there are 
   `equals`, `hashCode`, and `compareTo` methods. You may not modify this class.
2. In the `main/java/problem1` directory, create a new Java class named `BoxedUp`. 
3. Create an encapsulated instance variable of type `List` that holds `Box` objects. Remember that
   `List` objects use generic types, so you must have the angular brackets.
4. Create a constructor that takes a parameter of type `List` that holds `Box` objects. Make a new `List` object
   from that parameter using the `ArrayList` constructor and assign it to the instance variable. See here for 
   documentation: [ArrayList](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html).
   You should then use the `Collections.sort` method to sort the `List` in ascending order by `volume`. To understand
   how boxes are compared, look at the `compareTo` method in the `Box` class. You may also find 
   [this](https://beginnersbook.com/2013/12/sort-arraylist-in-descending-order-in-java/) example helpful.
5. Create a getter for the `boxes` instance variable
   - Uncomment and run the tests in `test/java/problem1/BoxedUpTest.java` that begin with the words
     `constructor...`.
   - After these pass, run the code analyzers and push your code to GitHub.
6. Create a method named `minimumBoxes` that takes one parameter, an integer, that represents the volume.
   Implement the pseudocode for the coin change algorithm presented in lecture to determine the minimum number of
   each `Box` size in the `boxes` instance variable needed to hold the volume. You can assume 
   that there are no duplicate sizes in `boxes` and that there is an infinite number of each `Box` type available.
   You can also assume that the provided `boxes` array is canonical in nature. The method should return an
   integer array representing the number of each `Box` size needed, from smallest to largest.
   - Uncomment and run the tests in `test/java/problem1/BoxedUpTest.java` that begin with the words
     `minimumBoxes...`.
   - After these pass, run the code analyzers and push your code to GitHub.
7. Create a method named `restrictedMinimumBoxes` that takes one parameter, an integer, that represents the volume.
   Implement the pseudocode for the coin change algorithm presented in lecture to determine the minimum number of
   each `Box` size in the `boxes` instance variable needed to hold the volume given that each `Box` has a specific 
   number of that size available for use (i.e. the `available` instance variable). You can assume that there are no 
   duplicate sizes in `boxes`. You can also assume that the provided `boxes` array is canonical in nature. The 
   method should return an integer array representing the number of each `Box` size needed, from smallest to largest.
   If the volume cannot be created using the `Box` sizes and availability provided, return `null`.
   - Uncomment and run the tests in `test/java/problem1/BoxedUpTest.java` that begin with the words
     `restrictedMinimumBoxes...`.
   - After these pass, run the code analyzers and push your code to GitHub.
8. Remember that you can create a `main` method to help yourself debug.

### Problem 2

1. In the `main/java/problem2` directory, create a .txt file named `CounterExamples.txt`. In this file, 
   Give counterexamples of each of the following options for scheduling as to why we would not want to 
   schedule based on these criteria:
   - Scheduling based on Earliest Start Time 
   - Scheduling based on Shortest Interval
   - Scheduling based on Fewest Conflicts
3. Each counter example should be clearly labeled and explained. You must use proper grammar and complete sentences.
   You can provide sample data, but again, this must be clearly detailed and explained.
4. Push this file to GitHub.
5. In the `main/java/problem2` directory, review the file named `Assignment.java`. This class represents an assignment
   with a `deadline` (`LocalTime` object) and a `studyTime` (integer, in minutes). In addition, there are `equals`, 
   `hashCode`, `toString` and `compareTo` methods. You may not modify this class until explicitly specified.
6. In the `main/java/problem2` directory, create a new Java class named `AssignmentSchedule`.
7. Create a `static` method named `minimizeLateSubmissionTimes` that takes a `List` of `Assignment` objects and a
   `LocalTime` object named `start` as parameters. The objective is to schedule the assignments, with no two overlapping 
   in time, such that they are all completed before their deadline, beginning at `start`. If this is not possible, we define the lateness 
   of the ith assignment to be the amount by which its finish time exceeds its deadline. The objective is to minimize the 
   maximum amount of lateness over all the assignments. The method should return a `List` of `LocalTime` objects where
   the order of the `LocalTime` objects is the starting time of each scheduled assignment. For the purposes of this exercise,
   you can assume that no two assignments have the same deadline. **Do not modify the `List` parameter that is passed in.**
   - How should you sort the assignments? By study time? By slack time (how long we can safely wait before starting a task)?
     By deadline? As a comment at the top of this file, specify which measurement you chose and why. Give counter 
     examples for the other two. Then, in the `Assignment` class, finish the `compareTo` method. This method is used
     to compare two objects when sorting - use your chosen measurement in this method.
   - Uncomment and run the tests in `test/java/problem2/AssignmentScheduleTest.java` that begin with the words
     `compareTo...`.
   - Java API Methods/Classes you are allowed to use: `Collections.sort`, `new ArrayList<>` (and other constructors), `List<Assignment>`, 
     `add` (from the `ArrayList` class), `remove` (from the `ArrayList` class), `get` (from the `ArrayList` class),
     `plusMinutes` (from the `LocalTime` class), `isAfter` (from the `LocalTime` class), `isBefore` (from the `LocalTime` class)
   - Documentation for the `LocalTime` class (note that the times are 24-hour/military time): [LocalTime](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/LocalTime.html)
   - Uncomment and run the tests in `test/java/problem2/AssignmentScheduleTest.java` that begin with the words
     `minimizeLateSubmissionTimes...`.
   - After these pass, run the code analyzers and push your code to GitHub.
8. Create a `static` method named `lateness` that takes a `List` of `Assignment` objects and a `List` of `LocalTime` 
   objects representing a schedule as parameters. The method should return an integer representing the total number 
   of minutes that the schedule is "late" - in other words the maximum "lateness" of the schedule. The lateness of the ith assignment 
   is the amount of time by which it exceeds its deadline given that you start working on the assignments 
   beginning at the `start` parameter. Note that the `List` of assignments is not sorted. 
   - Do not modify the parameter passed in.
   - You may find the Java API class/method `Duration.between` helpful for this. Note that it takes two `Temporal` 
     objects as parameters. A `LocalTime` object is a `Temporal` object (ahhh, interface inheritance).
   - Uncomment and run the tests in `test/java/problem2/AssignmentScheduleTest.java` that begin with the words
     `lateness...`.
   - After these pass, run the code analyzers and push your code to GitHub.
