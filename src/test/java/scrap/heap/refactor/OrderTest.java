package scrap.heap.refactor;

import org.junit.Test;
import scrap.heap.refactor.balloon.Balloon;
import scrap.heap.refactor.balloon.BalloonBuilder;
import scrap.heap.refactor.cake.Cake;
import scrap.heap.refactor.cake.CakeBuilder;
import scrap.heap.refactor.enums.*;

public class OrderTest {
    @Test
    public void testSampleOrder() {
        Order birthDayPartyOrder = new Order();

        assert birthDayPartyOrder.getBalloons().size() == 0;
        assert birthDayPartyOrder.getCakes().size() == 0;

        Balloon balloon = new BalloonBuilder()
                .withCount(10)
                .withMaterial(Material.LATEX)
                .withColor(Color.RED)
                .build();

        Cake cake = new CakeBuilder()
                .withFlavor(Flavor.CHOCOLATE)
                .withFrostFlavor(FrostFlavor.VANILLA)
                .withShape(Shape.CIRCLE)
                .withSize(Size.SMALL)
                .withColor(Color.BLUE)
                .build();

        birthDayPartyOrder.addCake(cake);
        birthDayPartyOrder.addBalloon(balloon);

        assert birthDayPartyOrder.getBalloons().size() == 1;
        assert birthDayPartyOrder.getCakes().size() == 1;

    }
}
