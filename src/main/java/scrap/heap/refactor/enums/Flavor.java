package scrap.heap.refactor.enums;

public enum Flavor {
    NO_FLAVOR (""),
    CHOCOLATE ("chocolate"),
    VANILLA ("vanilla");

    private final String flavor;

    Flavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return flavor;
    }
}
