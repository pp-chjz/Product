package max;

import java.util.Objects;

public class MacProduct implements MaxInterface{
    @Override
    public double findMax(Object o) {
        Product p = (Product) o ;

        return p.getPrice();

    }

}
