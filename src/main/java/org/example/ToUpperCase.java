package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class ToUpperCase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("amit","akash","komal","kewar","hsim","anwar");
        List<String> name1 = names.stream().filter(name -> name.startsWith("a")).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(name1);
    }
}
