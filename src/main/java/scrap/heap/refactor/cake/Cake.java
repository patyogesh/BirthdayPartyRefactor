package scrap.heap.refactor.cake;

/**
 * Cake is a abstract class.
 * This serves as a base class for Cake.
 */
public abstract class Cake {
    private final Cake basecake;

    public Cake(final Cake basecake) {
        this.basecake = basecake;
    }

    public Cake getBasecake() {
        return basecake;
    }

    public abstract String getAttr();
}
