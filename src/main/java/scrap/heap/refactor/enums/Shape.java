package scrap.heap.refactor.enums;

public enum Shape {
    NO_SHAPE (""),
    SQUARE ("square"),
    CIRCLE ("circle");

    private final String shape;

    Shape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return shape;
    }
}
