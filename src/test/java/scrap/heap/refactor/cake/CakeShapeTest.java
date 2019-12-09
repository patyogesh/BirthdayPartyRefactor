package scrap.heap.refactor.cake;

import org.junit.Test;
import scrap.heap.refactor.enums.Shape;

import static junit.framework.TestCase.assertEquals;

public class CakeShapeTest {

    @Test
    public void testShape() {
        Cake cake = new CakeShape(new EmptyCake(), Shape.CIRCLE);
        assertEquals(cake.getAttr(), "circle");
    }
}
