package scrap.heap.refactor.enums;

public enum Color {
    NO_COLOR (""),
    BROWN ("brown"),
    YELLOW ("yellow"),
    RED ("red"),
    BLUE ("blue"),
    WHITE ("white"),
    PINK ("pink");

    private final String color;

    Color(final String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
