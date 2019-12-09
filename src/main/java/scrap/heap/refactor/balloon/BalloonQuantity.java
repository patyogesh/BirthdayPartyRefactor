package scrap.heap.refactor.balloon;

public class BalloonQuantity extends Balloon {

    private final int quantity;

    public BalloonQuantity(Balloon balloon, final int quantity) {
        super(balloon);
        this.quantity = quantity;
    }

    @Override
    public String getAttr() {
        return String.valueOf(quantity);
    }
}
