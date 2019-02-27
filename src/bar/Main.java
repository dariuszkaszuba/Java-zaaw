package bar;

public class Main {
    public static void main(String[] args) {
        Bar bar = new BarDrink();
        Drink drink=bar.order(MenuItem.WINE);
        drink.drink("LECHU");
    }
}
