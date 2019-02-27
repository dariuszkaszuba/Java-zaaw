package projekt2;

public class Wheels extends BasePart {

    private int numberOfWheels;

    public Wheels(int price, int numberOfWheels) {
        super(price);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public int price() {
        return super.price() * numberOfWheels;
    }
}
