package scrap.heap.refactor.enums;

public enum FrostFlavor {
    NO_FROST_FLAVOR (""),
    CHOCOLATE ("chocolate"),
    VANILLA ("vanilla");

    private final String frostFlavor;

    FrostFlavor(String frostFlavor) {
        this.frostFlavor = frostFlavor;
    }

    @Override
    public String toString() {
        return frostFlavor;
    }
}
