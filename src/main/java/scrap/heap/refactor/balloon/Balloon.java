package scrap.heap.refactor.balloon;

public abstract class Balloon {
    private final Balloon balloon;

    public Balloon(Balloon balloon) {
        this.balloon = balloon;
    }

    public Balloon getBalloon() {
        return balloon;
    }
}
