package scrap.heap.refactor.cake;

import scrap.heap.refactor.enums.*;

public class CakeBuilder {

    private Flavor flavor;
    private FrostFlavor frostFlavor;
    private Shape shape;
    private Size size;
    private Color color;

    public CakeBuilder withFlavor(Flavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public CakeBuilder withFrostFlavor(FrostFlavor frostFlavor) {
        this.frostFlavor = frostFlavor;
        return this;
    }

    public CakeBuilder withShape(Shape shape) {
        this.shape = shape;
        return this;
    }

    public CakeBuilder withSize(Size size) {
        this.size = size;
        return this;
    }

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
