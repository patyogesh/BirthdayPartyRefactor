package scrap.heap.refactor.balloon;

import org.junit.Test;
import scrap.heap.refactor.enums.Material;

import static junit.framework.TestCase.assertEquals;

public class BalloonMaterialTest {

    @Test
    public void getBalloonMaterialTest() {
        Balloon balloon = new BalloonMaterial(new EmptyBalloon(), Material.LATEX);
        assertEquals(balloon.getAttr(), Material.LATEX.toString());
    }
}
