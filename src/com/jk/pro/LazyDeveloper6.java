package com.jk.pro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LazyDeveloper6
{
    public static void main(String[] args)
    {
        List<String> names=Arrays.asList("kiran","amit","kiran","jeevan","amit");
             List<String> list=names
                    .stream()
                      .map(String::toUpperCase)
                         .distinct()
                           .collect(Collectors.toList());

        System.out.println(list);
    }
}
