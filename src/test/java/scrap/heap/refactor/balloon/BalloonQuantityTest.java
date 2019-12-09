package scrap.heap.refactor.balloon;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BalloonQuantityTest {

    @Test
    public void testBalloonQuantity() {
        Balloon balloon = new BalloonQuantity(new EmptyBalloon(), 20);
        assertEquals(balloon.getAttr(), "20");
    }
}
