package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

    public static void main(String args[]) {
        List<Integer> arrayList = Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> newArrayList = new ArrayList<Integer>();

        // we want to get only the even numbers from arrayList collection

        //1. without using Stream
        for (int n : arrayList) {

            if (n % 2 == 0) newArrayList.add(n);

        }
        System.out.println(newArrayList);

        //2. using Stream

        newArrayList = arrayList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(newArrayList);

    }


}
