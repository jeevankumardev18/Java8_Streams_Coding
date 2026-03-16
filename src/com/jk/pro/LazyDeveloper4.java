package com.jk.pro;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction
{
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    Integer id;
    String type;
    double amount;

    public Transaction(Integer id,String type, double amount) {
        this.id=id;
        this.type = type;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return id +" "+ type +" "+ amount;
    }
}

public class LazyDeveloper4
{
    public static void main(String[] args)
    {
        List<Transaction> transactions= Arrays.asList(new Transaction(1,"Debit",25000),
                new Transaction(2,"Credit",30000),
                new Transaction(3,"Debit",10000),
                new Transaction(4,"Credit",50000));

        Map<String,List<Transaction>> grouped=transactions
                .stream()
                .collect(Collectors.groupingBy(Transaction::getType));

        System.out.println(grouped);
    }
}
