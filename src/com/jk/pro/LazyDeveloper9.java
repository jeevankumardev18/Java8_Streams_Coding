package com.jk.pro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LazyDeveloper9
{
    public static void main(String[] args)
    {
      List<List<String >> nested=  Arrays.asList
              (
                Arrays.asList("Cart-Service","Auth-Service"),
                Arrays.asList("User-Service","Payment-Service")
              );

                List<String> list=nested
                        .stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList());

        System.out.println(list);
    }
}
