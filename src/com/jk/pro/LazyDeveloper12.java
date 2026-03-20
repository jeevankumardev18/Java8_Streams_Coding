package com.jk.pro;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LazyDeveloper12
{
    public static void main(String[] args)
    {
        List<String> languages =Arrays.asList("Java","Python","ReactJs","AI","Kotlin");

          Map<Integer,List<String>> grouped= languages
                                                 .stream()
                                                   .collect(Collectors.groupingBy(String::length));

        System.out.println(grouped);
    }
}
