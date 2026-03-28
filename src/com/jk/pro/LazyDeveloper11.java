package com.jk.pro;

import java.util.Arrays;
import java.util.List;

public class LazyDeveloper11
{
    public static void main(String[] args)
    {
        List<Integer> amounts=Arrays.asList(200,500,700,1000,2000);
        int sum=amounts
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);




    }
}

