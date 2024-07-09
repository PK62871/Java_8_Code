package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailPass {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            Integer num = itr.next();
            System.out.println(num);
            numbers.add(10);
        }
    }
}
