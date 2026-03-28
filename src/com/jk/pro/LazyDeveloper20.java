package com.jk.pro;

import java.util.Arrays;
import java.util.List;

class Order {
    private int orderId;
    private String customerName;
    private double amount;

    public Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    // Getters
    public int getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public double getAmount() { return amount; }

    @Override
    public String toString() {
        return "Order #" + orderId + " for " + customerName + ": $" + amount;
    }
}


public class LazyDeveloper20
{
    public static void main(String[] args)
    {
        List<Order> orders = Arrays.asList(
                new Order(1001, "Aman", 250.50),
                new Order(1002, "Sneha", 150.00),
                new Order(1003, "Rahul", 500.75),
                new Order(1004, "Priya", 99.99)
        );

        double totalRevenue=orders
                .stream()
                .mapToDouble(Order::getAmount)
                .sum();

        System.out.println("--- Daily Sales Report ---");
        orders.forEach(System.out::println);
        System.out.println("--------------------------");
        System.out.println("Total Revenue Generated: " + totalRevenue);
    }
}
