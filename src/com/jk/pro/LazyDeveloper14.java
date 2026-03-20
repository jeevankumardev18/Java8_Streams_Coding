package com.jk.pro;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LazyDeveloper14
{
    public static void main(String[] args)
    {
        List<String> life=Arrays.asList("Java","SpringBoot","Jeevan","G1","Java","Microservices");

        Map<String,Long> frequency=life
                 .stream()
                 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(frequency);


    }
}
