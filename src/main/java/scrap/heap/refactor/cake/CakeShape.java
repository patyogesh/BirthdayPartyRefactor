package scrap.heap.refactor.cake;

import scrap.heap.refactor.enums.Shape;

public class CakeShape extends Cake {

    private final Shape shape;

    public CakeShape(Cake basecake, Shape shape) {
        super(basecake);
        this.shape = shape;
    }

    @Override
    public String getAttr() {
        return shape.toString();
    }
}
