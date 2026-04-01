package com.jk.pro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LazyDeveloper24
{
    public static void main(String[] args)
    {
        List<Product> productList=Arrays.asList(new Product("Laptop",55000),
                new Product("Speakers",25000),
                new Product("iPhone",98000),
                new Product("Watch",1300) );

       String products = productList
                .stream()
                .filter(p->p.getPrice()>5000)
                .map(Product::getName)
                .collect(Collectors.joining(" & "));

        System.out.println(products);
    }
}
