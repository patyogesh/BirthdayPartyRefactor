package scrap.heap.refactor.cake;

public abstract class Cake {
    private final Cake basecake;

    public Cake(Cake basecake) {
        this.basecake = basecake;
    }

    public Cake getBasecake() {
        return basecake;
    }

    public abstract String getAttr();
}
