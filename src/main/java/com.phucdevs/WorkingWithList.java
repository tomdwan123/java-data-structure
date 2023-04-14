package com.phucdevs;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("yellow");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("blue"));

        colors.forEach(System.out::println);

        List<String> colorsUnmodifiable = List.of("yellow", "blue");
        colorsUnmodifiable.add("green");
    }
}
