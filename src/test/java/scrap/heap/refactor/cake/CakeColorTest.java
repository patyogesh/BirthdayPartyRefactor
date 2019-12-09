package scrap.heap.refactor.cake;

import org.junit.Test;
import scrap.heap.refactor.enums.Color;

import static junit.framework.TestCase.assertEquals;

public class CakeColorTest {
    @Test
    public void testGetColor() {
        Cake cake = new CakeColor(new EmptyCake(), Color.BROWN);
        assertEquals(cake.getAttr(), "brown");
    }
}
