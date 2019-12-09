package scrap.heap.refactor.balloon;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EmptyBalloonTest {
    @Test
    public void testEmptyBalloon() {
        Balloon emptyBalloon = new EmptyBalloon();
        assertEquals(emptyBalloon.getAttr(), "");
    }
}
