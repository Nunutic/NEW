import java.util.*;

/**
 * Created by anna on 2017.07.11..
 */
public class WhatCanEnum {
    public static void main(String[] args){

        // enum has methods: valueOf and values + ordinal and name

        System.out.println(SEASONS.AUTUMN.ordinal() + SEASONS.AUTUMN.name());

        System.out.println(SEASONS.valueOf("SUMMER"));

        SEASONS[] list = SEASONS.values();

        for (int i = 0; i < list.length; i++)
        {
            System.out.println(list[i]);
        }

        // as it implements Comparable, it can be stored in sorted collections (SortedSet, TreeSet, TreeMap)

        TreeSet<SEASONS> set = new TreeSet<>();

        set.add(SEASONS.AUTUMN);


    }
}
