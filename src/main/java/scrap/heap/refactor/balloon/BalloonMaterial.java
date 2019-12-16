package scrap.heap.refactor.balloon;

import scrap.heap.refactor.enums.Material;

public class BalloonMaterial extends Balloon {

    private final Material material;

    public BalloonMaterial(Balloon balloon, Material material) {
        super(balloon);
        this.material = material;
    }

    @Override
    public String getAttr() {
        return material.toString();
    }
}
