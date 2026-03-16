package com.jk.pro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LazyDeveloper2
{
    public static void main(String[] args)
    {
        List<Integer> nums=Arrays.asList(2,5,8,9,11);
        List<Integer> list=nums
                               .stream()
                                  .map(n->n*n)
                                    .filter(n->n>50)
                                      .collect(Collectors.toList());
        System.out.println(list);
    }
}
