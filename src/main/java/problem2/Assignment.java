package problem2;

import java.time.LocalTime;
import java.util.Objects;

public class Assignment implements Comparable<Assignment> {

    private LocalTime deadline;
    private int studyTime;

    public Assignment(LocalTime deadline, int studyTime) {
        this.deadline = deadline;
        this.studyTime = studyTime;
    }

    public LocalTime getDeadline() {
        return this.deadline;
    }

    public int getStudyTime() {
        return this.studyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Assignment))
            return false;
        Assignment that = (Assignment) o;
        return getStudyTime() == that.getStudyTime() && getDeadline().equals(that.getDeadline());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeadline(), getStudyTime());
    }

    @Override
    public int compareTo(Assignment o) {
        // Complete this method.
        // The return statement below is just a place-holder so the code compiles.
        return 0;
    }

    @Override
    public String toString() {
        return "Assignment " +
                "deadline: " + deadline +
                ", executionTime: " + studyTime;
    }
}
