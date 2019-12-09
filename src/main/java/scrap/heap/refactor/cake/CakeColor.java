package scrap.heap.refactor.cake;

import scrap.heap.refactor.enums.Color;

public class CakeColor extends Cake{

    private final Color color;

    public CakeColor(Cake baseCake, Color color) {
        super(baseCake);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
