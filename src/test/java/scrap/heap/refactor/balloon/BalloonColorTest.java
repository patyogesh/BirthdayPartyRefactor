package scrap.heap.refactor.balloon;

import org.junit.Test;
import scrap.heap.refactor.enums.Color;

import static junit.framework.TestCase.assertEquals;

public class BalloonColorTest {
    @Test
    public void getBalloonColorTest() {
        Balloon balloon = new BalloonColor(new EmptyBalloon(), Color.WHITE);
        assertEquals(balloon.getAttr(), Color.WHITE.toString());
    }
}
