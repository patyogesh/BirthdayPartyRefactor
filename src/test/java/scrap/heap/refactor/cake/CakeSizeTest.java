package scrap.heap.refactor.cake;

import org.junit.Test;
import scrap.heap.refactor.enums.Size;

import static junit.framework.TestCase.assertEquals;

public class CakeSizeTest {
    @Test
    public void testCakeSize() {
        Cake cake = new CakeSize(new EmptyCake(), Size.SMALL);
        assertEquals(cake.getAttr(), "small");
    }
}
