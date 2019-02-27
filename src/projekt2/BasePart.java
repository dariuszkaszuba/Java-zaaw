package projekt2;

public class BasePart implements Part {
    protected int price;

    public BasePart(int price) {
        this.price = price;
    }
    @Override
    public int price(){
        return price;
    }
}
