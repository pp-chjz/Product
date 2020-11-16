package max;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product one = new Product("one",10);
        Product two = new Product("one",100);
        Product t = new Product("one",120);
        Product four = new Product("one",15);

        List<Object> products = new ArrayList<>();
        products.add(one);
        products.add(t);
        products.add(two);
        products.add(four);

        System.out.println(StatUtil.max(new MacProduct(),products));


    }

}
