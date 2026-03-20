package com.jk.pro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LazyDeveloper15
{
    public static void main(String[] args)
    {
        List<Integer> ages = Arrays.asList(22, 28, 35, 40);

          Double averageValue=ages
              .stream()
              .collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(averageValue);


    }
}
