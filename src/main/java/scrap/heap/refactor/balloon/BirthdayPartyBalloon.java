package scrap.heap.refactor.balloon;

public class BirthdayPartyBalloon extends Balloon{

    public BirthdayPartyBalloon() {
        this(new EmptyBalloon());
    }

    public BirthdayPartyBalloon(Balloon balloon) {
        super(balloon);
    }

    @Override
    public String getAttr() {
        return "";
    }
}
