package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {


                List<Integer> values = Arrays.asList(1, 2, 3, 4);

                int sum = values.stream()
                        .reduce(0, Integer::sum);

                System.out.println("Sum of elements: " + sum);
            }
        }



