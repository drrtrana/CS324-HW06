package problem2;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentScheduleTest {

    /*@Test
    void compareToCase1() {
        Assignment a1 = new Assignment(LocalTime.of(9, 30), 45);
        Assignment a2 = new Assignment(LocalTime.of(8, 30), 10);
        assertEquals(1, a1.compareTo(a2));
    }*/

    /*@Test
    void compareToCase2() {
        Assignment a1 = new Assignment(LocalTime.NOON, 25);
        Assignment a2 = new Assignment(LocalTime.of(9, 30), 50);
        assertEquals(1, a1.compareTo(a2));
    }*/

    /*@Test
    void compareToCase3() {
        Assignment a1 = new Assignment(LocalTime.NOON, 60);
        Assignment a2 = new Assignment(LocalTime.of(19, 4), 120);
        assertEquals(-1, a1.compareTo(a2));
    }*/

    /*@Test
    void compareToCase4() {
        Assignment a1 = new Assignment(LocalTime.of(12, 15), 60);
        Assignment a2 = new Assignment(LocalTime.of(16, 19), 45);
        assertEquals(-1, a1.compareTo(a2));
    }*/

    /*@Test
    void compareToCase5() {
        Assignment a1 = new Assignment(LocalTime.of(3, 3), 90);
        Assignment a2 = new Assignment(LocalTime.of(3, 3), 90);
        assertEquals(0, a1.compareTo(a2));
    }*/

    /*@Test
    void compareToCase6() {
        Assignment a1 = new Assignment(LocalTime.of(9, 26), 45);
        Assignment a2 = new Assignment(LocalTime.of(9, 26), 32);
        assertEquals(0, a1.compareTo(a2));
    }*/

    /*@Test
    void minimizeLateSubmissionTimesShouldNotModifyListParameter() {
        List<Assignment> assignments = new ArrayList<>();
        Collections.addAll(assignments, new Assignment(LocalTime.NOON, 120),
                new Assignment(LocalTime.of(10, 30), 90),
                new Assignment(LocalTime.of(11, 15), 60));
        List<Assignment> unchanged = new ArrayList<>();
        Collections.addAll(unchanged, new Assignment(LocalTime.NOON, 120),
                new Assignment(LocalTime.of(10, 30), 90),
                new Assignment(LocalTime.of(11, 15), 60));
        AssignmentSchedule.minimizeLateSubmissionTimes(assignments, LocalTime.now());
        assertEquals(unchanged, assignments);
    }*/

    /*@Test
    void minimizeLateSubmissionTimesCase1() {
        List<Assignment> assignments = new ArrayList<>();
        Collections.addAll(assignments, new Assignment(LocalTime.NOON, 120),
                new Assignment(LocalTime.of(10, 30), 90),
                new Assignment(LocalTime.of(11, 15), 60));
        List<LocalTime> times = new ArrayList<>();
        Collections.addAll(times,
                LocalTime.of(9, 0), LocalTime.of(10, 30),
                LocalTime.of(11, 30));
        assertEquals(times, AssignmentSchedule.minimizeLateSubmissionTimes(assignments, LocalTime.of(9, 0)));
    }*/

    /*@Test
    void minimizeLateSubmissionTimesCase2() {
        List<Assignment> assignments = new ArrayList<>();
        Collections.addAll(assignments, new Assignment(LocalTime.NOON, 120),
                new Assignment(LocalTime.of(10, 30), 90),
                new Assignment(LocalTime.of(11, 15), 60));
        List<LocalTime> times = new ArrayList<>();
        Collections.addAll(times,
                LocalTime.of(11, 15), LocalTime.of(12, 45),
                LocalTime.of(13, 45));
        assertEquals(times, AssignmentSchedule.minimizeLateSubmissionTimes(assignments, LocalTime.of(11, 15)));
    }*/

    /*@Test
    void minimizeLateSubmissionTimesCase3() {
        List<Assignment> assignments = new ArrayList<>();
        Collections.addAll(assignments, new Assignment(LocalTime.of(23, 59), 75),
                new Assignment(LocalTime.of(17, 0), 180),
                new Assignment(LocalTime.of(17, 30), 60),
                new Assignment(LocalTime.of(18, 0), 45),
                new Assignment(LocalTime.of(15, 15), 300),
                new Assignment(LocalTime.of(19, 0), 25),
                new Assignment(LocalTime.of(13, 45), 90));
        List<LocalTime> times = new ArrayList<>();
        Collections.addAll(times,
                LocalTime.of(10, 45), LocalTime.of(12, 15), LocalTime.of(17, 15),
                LocalTime.of(20, 15), LocalTime.of(21, 15), LocalTime.of(22, 0),
                LocalTime.of(22, 25));
        assertEquals(times, AssignmentSchedule.minimizeLateSubmissionTimes(assignments, LocalTime.of(10, 45)));
    }*/

    /*@Test
    void latenessCase1() {
        List<Assignment> assignments = new ArrayList<>();
        Collections.addAll(assignments, new Assignment(LocalTime.NOON, 120),
                new Assignment(LocalTime.of(10, 30), 90),
                new Assignment(LocalTime.of(11, 15), 60));
        List<LocalTime> schedule = new ArrayList<>();
        Collections.addAll(schedule,
                LocalTime.of(9, 0), LocalTime.of(10, 30),
                LocalTime.of(11, 30));
        assertEquals(105, AssignmentSchedule.lateness(assignments, schedule));
    }*/

    /*@Test
    void latenessCase2() {
        List<Assignment> assignments = new ArrayList<>();
        Collections.addAll(assignments, new Assignment(LocalTime.NOON, 120),
                new Assignment(LocalTime.of(10, 30), 90),
                new Assignment(LocalTime.of(11, 15), 60));
        List<LocalTime> schedule = new ArrayList<>();
        Collections.addAll(schedule,
                LocalTime.of(11, 15), LocalTime.of(12, 45),
                LocalTime.of(13, 45));
        assertEquals(510, AssignmentSchedule.lateness(assignments, schedule));
    }*/

    /*@Test
    void latenessCase3() {
        List<Assignment> assignments = new ArrayList<>();
        Collections.addAll(assignments, new Assignment(LocalTime.of(23, 59), 75),
                new Assignment(LocalTime.of(17, 0), 180),
                new Assignment(LocalTime.of(17, 30), 60),
                new Assignment(LocalTime.of(18, 0), 45),
                new Assignment(LocalTime.of(15, 15), 300),
                new Assignment(LocalTime.of(19, 0), 25),
                new Assignment(LocalTime.of(13, 45), 90));
        List<LocalTime> schedule = new ArrayList<>();
        Collections.addAll(schedule,
                LocalTime.of(10, 45), LocalTime.of(12, 15), LocalTime.of(17, 15),
                LocalTime.of(20, 15), LocalTime.of(21, 15), LocalTime.of(22, 0),
                LocalTime.of(22, 25));
        assertEquals(985, AssignmentSchedule.lateness(assignments, schedule));
    }*/
}