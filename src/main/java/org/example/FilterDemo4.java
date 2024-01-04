package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class product {

    int id;
    String name;
    int price;

    public product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class FilterDemo4 {

    public static void main(String args[]) {

        List<product> products = new ArrayList<>();

        products.add(new product(1, "HP Laptop", 15000));
        products.add(new product(2, "Lenovo Laptop", 17000));
        products.add(new product(3, "Dell Laptop", 19000));
        products.add(new product(4, "MacPro Laptop", 30000));
        products.add(new product(5, "Samsung Laptop", 50000));

        products.stream().filter(product -> product.price > 20000).forEach(product -> System.out.println(product.price));


    }
}
