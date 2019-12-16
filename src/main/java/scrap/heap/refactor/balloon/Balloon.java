package scrap.heap.refactor.balloon;

/**
 * Balloon is an abstract class.
 * This serves as base class for Balloon.
 */
public abstract class Balloon {
    private final Balloon balloon;

    public Balloon(final Balloon balloon) {
        this.balloon = balloon;
    }

    public Balloon getBalloon() {
        return balloon;
    }

    public abstract String getAttr();
}
