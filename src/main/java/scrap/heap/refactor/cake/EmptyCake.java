package scrap.heap.refactor.cake;

public class EmptyCake extends Cake{
    public EmptyCake() {
        super(null);
    }

    @Override
    public String getAttr() {
        return "";
    }
}
