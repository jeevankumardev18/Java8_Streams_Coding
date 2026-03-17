package com.jk.pro;

import java.util.Arrays;
import java.util.List;

public class LazyDeveloper8
{
    public static void main(String[] args)
    {
        List<Integer> amounts = Arrays.asList(1200, 4500, 800, 3200, 6700);

             Integer maxAmount=amounts
                                     .stream()
                                        .max(Integer::compare)
                                          .orElse(0);

        System.out.println(maxAmount);
    }
}
