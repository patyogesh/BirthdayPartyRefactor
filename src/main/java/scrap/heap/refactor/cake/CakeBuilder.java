package scrap.heap.refactor.cake;

import scrap.heap.refactor.enums.*;

/**
 * CakeBuilder used Builder pattern to build Cake object.
 */

public class CakeBuilder {

    private Flavor flavor;
    private FrostFlavor frostFlavor;
    private Shape shape;
    private Size size;
    private Color color;

    public Flavor getFlavor() {
        return flavor;
    }

    public FrostFlavor getFrostFlavor() {
        return frostFlavor;
    }

    public Shape getShape() {
        return shape;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param flavor Cake flavor
     */
    public CakeBuilder withFlavor(Flavor flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * @param frostFlavor Cake frosting flavor
     */
    public CakeBuilder withFrostFlavor(FrostFlavor frostFlavor) {
        this.frostFlavor = frostFlavor;
        return this;
    }

    /**
     * @param shape Cake shape
     */
    public CakeBuilder withShape(Shape shape) {
        this.shape = shape;
        return this;
    }

    /**
     * @param size Cake size
     */
    public CakeBuilder withSize(Size size) {
        this.size = size;
        return this;
    }

    /**
     * @param color Cake color
     */
    public CakeBuilder withColor(Color color) {
        this.color = color;
        return this;
    }

    public Cake build() {
        Cake cake = new BirthDayCake();

        cake = new CakeFlavor(cake, flavor);
        cake = new CakeFrostFlavor(cake, frostFlavor);
        cake = new CakeShape(cake, shape);
        cake = new CakeSize(cake, size);
        cake = new CakeColor(cake, color);

        return cake;
    }


}
