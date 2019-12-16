package scrap.heap.refactor.cake;

import org.junit.Test;
import scrap.heap.refactor.enums.FrostFlavor;

import static junit.framework.TestCase.assertEquals;

public class CakeFrostFlavorTest {

    @Test
    public void testGetFrostFlavor() {
        Cake cake = new CakeFrostFlavor(new EmptyCake(), FrostFlavor.CHOCOLATE);
        assertEquals(cake.getAttr(), "chocolate");
    }
}
