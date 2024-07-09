package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailSafe {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> modifiedElements = new ArrayList<>(); // Create a separate list for modified elements
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            Integer num = itr.next();
            System.out.println(num);
            modifiedElements.add(10); // Add modified elements to the separate list
        }

        numbers.addAll(modifiedElements); // Add modified elements back to the original list
    }
}

