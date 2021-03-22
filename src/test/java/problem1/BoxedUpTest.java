package problem1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxedUpTest {

    /*@Test
    void constructorShouldMakeCopyOfBoxesParameter() {
        List<Box> boxes = new ArrayList<>();
        Collections.addAll(boxes, new Box(3), new Box(1), new Box(5));
        BoxedUp bu = new BoxedUp(boxes);
        assertNotEquals(boxes, bu.getBoxes());
    }*/

    /*@Test
    void constructorShouldReverseSortBoxes() {
        List<Box> boxes = new ArrayList<>();
        Collections.addAll(boxes, new Box(3), new Box(1), new Box(5));
        List<Box> expBoxes = new ArrayList<>();
        Collections.addAll(expBoxes, new Box(1), new Box(3), new Box(5));
        BoxedUp bu = new BoxedUp(boxes);
        assertNotEquals(expBoxes, bu.getBoxes());
    }*/

    /*@Test
    void minimumBoxesCase1() {
        List<Box> boxes = new ArrayList<>();
        Collections.addAll(boxes, new Box(5), new Box(1), new Box(25), new Box(10));
        BoxedUp bu1 = new BoxedUp(boxes);
        assertArrayEquals(new int[]{1, 1, 1, 1}, bu1.minimumBoxes(41));
        assertArrayEquals(new int[]{3, 2, 0, 0}, bu1.minimumBoxes(95));
    }*/

    /*@Test
    void minimumBoxesCase2() {
        List<Box> boxes2 = new ArrayList<>();
        Collections.addAll(boxes2, new Box(4), new Box(16), new Box(1));
        BoxedUp bu2 = new BoxedUp(boxes2);
        assertArrayEquals(new int[]{6, 0, 3}, bu2.minimumBoxes(99));
        assertArrayEquals(new int[]{1, 1, 1}, bu2.minimumBoxes(21));
    }*/

    /*@Test
    void minimumBoxesCase3() {
        List<Box> boxes3 = new ArrayList<>();
        Collections.addAll(boxes3, new Box(25), new Box(100), new Box(1),
                new Box(200), new Box(5), new Box(10));
        BoxedUp bu3 = new BoxedUp(boxes3);
        assertArrayEquals(new int[]{2, 1, 0, 0, 1, 1}, bu3.minimumBoxes(506));
        assertArrayEquals(new int[]{1, 1, 1, 0, 1, 0}, bu3.minimumBoxes(330));
    }*/

    /*@Test
    void requiredMinimumBoxesCase1() {
        List<Box> boxes = new ArrayList<>();
        Collections.addAll(boxes, new Box(5, 4), new Box(1, 10), new Box(25, 3), new Box(10, 2));
        BoxedUp bu1 = new BoxedUp(boxes);
        assertArrayEquals(new int[]{3, 2, 1, 1}, bu1.restrictedMinimumBoxes(101));
        assertEquals(null, bu1.restrictedMinimumBoxes(126));
    }*/

    /*@Test
    void requiredMinimumBoxesCase2() {
        List<Box> boxes2 = new ArrayList<>();
        Collections.addAll(boxes2, new Box(4, 4), new Box(16, 3), new Box(1, 0));
        BoxedUp bu2 = new BoxedUp(boxes2);
        assertEquals(null, bu2.restrictedMinimumBoxes(53));
        assertArrayEquals(new int[]{3, 4, 0}, bu2.restrictedMinimumBoxes(64));
    }*/
}