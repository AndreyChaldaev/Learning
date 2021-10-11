package com.javarush.task.pro.task18.task1810;

import java.util.ArrayList;
import java.util.Collections;

/* 
Преобразование списка в массив
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Ты", "ж", "программист");

        var integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1000, 2000, 3000);


        String[] stringArray = toStringArray(strings);
        for (String i : stringArray) {
            System.out.println(i);
        }

        Integer[] integerArray = toIntegerArray(integers);
        for (Integer i : integerArray) {
            System.out.println(i);
        }
    }

    public static String[] toStringArray(ArrayList<String> strings) {

        return strings.toArray(String[]::new);
    }

    public static Integer[] toIntegerArray(ArrayList<Integer> integers) {

        return integers.toArray(Integer[]::new);
    }
}
