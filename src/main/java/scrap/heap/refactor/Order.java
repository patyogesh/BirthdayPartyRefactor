package scrap.heap.refactor;

import scrap.heap.refactor.balloon.Balloon;
import scrap.heap.refactor.cake.Cake;

import java.util.LinkedList;
import java.util.List;

public class Order {

    private List<Balloon> balloons;
    private List<Cake> cakes;

    public List<Balloon> getBalloons() {
        return balloons;
    }

    public List<Cake> getCakes() {
        return cakes;
    }

    public Order() {
        balloons = new LinkedList<>();
        cakes = new LinkedList<>();
    }

    public void addBalloon(Balloon balloon) {
        this.balloons.add(balloon);
    }

    public void addCake(Cake cake) {
        this.addCake(cake);
    }
}
