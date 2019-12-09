package scrap.heap.refactor.balloon;

import scrap.heap.refactor.cake.Cake;

public class EmptyBalloon extends Balloon{
    public EmptyBalloon() {
        super(null);
    }

    @Override
    public String getAttr() {
        return "";
    }
}
