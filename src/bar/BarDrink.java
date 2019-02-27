package bar;

public class BarDrink implements Bar {
    @Override
    public Drink order(MenuItem drink) {
        switch (drink) {
            case TEA:
                return new Tea();
            case WINE:
                return new Wine();
            case COFEE:
                return new Coffee();
            default:
                throw new IllegalArgumentException("Drink type not found in menu");
        }
    }
}
