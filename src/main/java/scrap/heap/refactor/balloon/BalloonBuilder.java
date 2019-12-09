package scrap.heap.refactor.balloon;

import scrap.heap.refactor.enums.Color;
import scrap.heap.refactor.enums.Material;

public class BalloonBuilder {

    private Color color;
    private Material material;
    private Integer count;

    public BalloonBuilder withColor(Color color) {
        this.color = color;
        return this;
    }

    public BalloonBuilder withMaterial(Material material) {
        this.material = material;
        return this;
    }

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
