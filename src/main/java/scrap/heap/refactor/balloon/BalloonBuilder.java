package scrap.heap.refactor.balloon;

import scrap.heap.refactor.enums.Color;
import scrap.heap.refactor.enums.Material;

/**
 * BalloonBuilder uses Builder pattern to build Balloon object
 */
public class BalloonBuilder {

    private Color color;
    private Material material;
    private Integer count;

    /**
     * @param color balloon color
     */
    public BalloonBuilder withColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * @param material balloon material
     */
    public BalloonBuilder withMaterial(Material material) {
        this.material = material;
        return this;
    }

    /**
     * @param count balloon count/quantity
     */
    public BalloonBuilder withCount(Integer count) {
        this.count = count;
        return this;
    }

    public Balloon build() {
        Balloon balloon = new BirthdayPartyBalloon();

        balloon = new BalloonColor(balloon, color);
        balloon = new BalloonMaterial(balloon, material);
        balloon = new BalloonQuantity(balloon, count);

        return balloon;
    }
}
