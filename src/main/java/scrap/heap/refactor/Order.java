package scrap.heap.refactor;

import scrap.heap.refactor.balloon.Balloon;
import scrap.heap.refactor.cake.Cake;

import java.util.LinkedList;
import java.util.List;

/**
 * Order class that maintains list of items such as Ballon, Cake.
 */
public class Order {

    private List<Balloon> balloons;
    private List<Cake> cakes;

    public List<Balloon> getBalloons() {
        return balloons;
    }

    public List<Cake> getCakes() {
        return cakes;
    }

    /**
     * Order constructor
     */
    public Order() {
        balloons = new LinkedList<>();
        cakes = new LinkedList<>();
    }

    /**
     * Adds @balloon to order
     */
    public void addBalloon(Balloon balloon) {
        this.balloons.add(balloon);
    }

    /**
     * Adds @cake to order
     */

    public void addCake(Cake cake) {
        this.cakes.add(cake);
    }
}
