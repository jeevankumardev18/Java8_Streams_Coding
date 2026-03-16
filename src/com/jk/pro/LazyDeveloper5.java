package com.jk.pro;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LazyDeveloper5
{
    public static void main(String[] args)
    {
       String sentence= "java is easy and java is powerful";

        Map<String,Long> grouped= Arrays
                .stream(sentence.split(" "))
                 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(grouped);



    }
}
