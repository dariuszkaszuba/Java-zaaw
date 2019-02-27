package projekt2;

import java.util.Arrays;
import java.util.Collection;

public class Car {
    private Collection<Part> parts;

    public Car(Part... parts) {
        this.parts = Arrays.asList(parts);
    }

    public int totalCost() {
//        return parts.stream().mapToInt(Part::price).sum();
        int sum = 0;
        for (Part part : parts
        ) {
            sum += part.price();
        }
        return sum;
    }

}
