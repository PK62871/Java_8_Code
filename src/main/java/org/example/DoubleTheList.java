package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoubleTheList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,3,2,2,1,2,1,26,8);
        Stream<Integer> integerStream = list.stream().map(i -> i * 2);
        List<Integer> collect = integerStream.collect(Collectors.toList());
        System.out.println(collect);
    }
}
