package org.example;

import java.util.StringJoiner;

public class StringJoinner1 {
    public static void main(String[] args) {

        StringJoiner join = new StringJoiner(", ", "[", "]");
        join.add("Prabhakar");
        join.add("Kumar");
        System.out.println(join.toString());

    }
}
