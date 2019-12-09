package scrap.heap.refactor.balloon;

import scrap.heap.refactor.enums.Color;

public class BalloonColor extends Balloon{

    private final Color color;

    public BalloonColor(Balloon balloon, Color color) {
        super(balloon);
        this.color = color;
    }

    @Override
    public String getAttr() {
        return color.toString();
    }
}
