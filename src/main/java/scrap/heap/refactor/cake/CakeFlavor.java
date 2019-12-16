package scrap.heap.refactor.cake;

import scrap.heap.refactor.enums.Flavor;

public class CakeFlavor extends Cake{

    private final Flavor flavor;

    public CakeFlavor(Cake basecake, Flavor flavor) {
        super(basecake);
        this.flavor = flavor;
    }

    @Override
    public String getAttr() {
        return flavor.toString();
    }
}
