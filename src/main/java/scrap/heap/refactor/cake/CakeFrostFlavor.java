package scrap.heap.refactor.cake;

import scrap.heap.refactor.enums.FrostFlavor;

public class CakeFrostFlavor extends Cake{

    private final FrostFlavor frostFlavor;

    public CakeFrostFlavor(Cake basecake, FrostFlavor frostFlavor) {
        super(basecake);
        this.frostFlavor = frostFlavor;
    }

    public FrostFlavor getFrostFlavor() {
        return frostFlavor;
    }
}
