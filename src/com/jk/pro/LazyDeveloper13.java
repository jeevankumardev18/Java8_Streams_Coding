package com.jk.pro;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LazyDeveloper13
{
    public static void main(String[] args)
    {
       List<String> techStack=Arrays.asList("Java","SpringBoot","Hibernate","Java 8",
                "Junit","RestApis","MySql","Microservices","AngularJs");

       Map<Boolean,List<String>> partitioned=techStack
               .stream()
               .collect(Collectors.partitioningBy(s->s.startsWith("J")));

        System.out.println(partitioned);
    }
}
