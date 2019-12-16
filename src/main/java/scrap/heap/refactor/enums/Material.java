package scrap.heap.refactor.enums;

public enum Material {
    NO_MATERIAL (""),
    MYLAR ("mylar"),
    LATEX("latext");

    private final String material;

    Material(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material;
    }
}
