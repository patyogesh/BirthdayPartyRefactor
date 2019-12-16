package scrap.heap.refactor.cake;

import org.junit.Test;
import scrap.heap.refactor.enums.Flavor;

import static junit.framework.TestCase.assertEquals;

public class CakeFlavorTest {

    @Test
    public void testGetFlavor() {
        Cake cake = new CakeFlavor(new EmptyCake(), Flavor.CHOCOLATE);
        assertEquals(cake.getAttr(), "chocolate");
    }
}
