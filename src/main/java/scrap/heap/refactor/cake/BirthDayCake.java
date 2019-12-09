package scrap.heap.refactor.cake;

public class BirthDayCake extends Cake{

    public BirthDayCake(Cake basecake) {
        super(basecake);
    }

    public BirthDayCake() {
        this(new BirthDayCake());
    }

    @Override
    public String getAttr() {
        return "BirthDayCake";
    }
}
