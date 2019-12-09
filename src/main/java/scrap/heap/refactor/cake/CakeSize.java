package scrap.heap.refactor.cake;

import scrap.heap.refactor.enums.Size;

public class CakeSize extends Cake {

    private final Size size;

    public CakeSize(Cake basecake, Size size) {
        super(basecake);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
}
