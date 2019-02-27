package bar;

public abstract class Drink {
    void drink(String customer){
        System.out.printf("Customer %s drinks %s.\n", customer, name());
    }

    protected abstract String name();
}
