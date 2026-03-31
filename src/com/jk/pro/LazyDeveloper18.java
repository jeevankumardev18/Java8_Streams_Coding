package com.jk.pro;

import java.util.*;
import java.util.stream.Collectors;

class Product
{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(String name,double price)
    {
        this.name=name;
        this.price=price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + "->" + name;
    }
}

public class LazyDeveloper18
{
    public static void main(String[] args)
    {
        List<Product> products=Arrays.asList(new Product(1,"Laptop",25000),
                new Product(2,"iPhone",54000),
                new Product(3,"Watch",1500));

      Map<Integer,String> map=products
              .stream()
              .filter(p->p.getPrice()>500)
              .collect(Collectors.toMap(Product::getId,Product::getName));

        System.out.println(map);


    }
}
