package scrap.heap.refactor.enums;

public enum Size {
    NO_SIZE (""),
    SMALL ("small"),
    MEDIUM ("medium"),
    LARGE ("large");

    private final String size;

    Size(final String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size;
    }
}
