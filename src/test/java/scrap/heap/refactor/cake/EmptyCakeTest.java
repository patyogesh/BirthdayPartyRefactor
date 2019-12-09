package scrap.heap.refactor.cake;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EmptyCakeTest {

    @Test
    public void testEmptyCake() {
        Cake cake = new EmptyCake();
        assertEquals(cake.getAttr(), "");
    }
}
