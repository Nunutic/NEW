import org.omg.CORBA.Object;

import java.util.*;

/**
 * Created by anna on 2017.07.11..
 */
public class WhatCanEnum {
    public static void main(String[] args){

        // enum has 2 methods: valueOf and values
        System.out.println(SEASONS.valueOf("AUTUMN"));

        SEASONS[] list = SEASONS.values();

        for (int i = 0; i < list.length; i++)
        {
            System.out.println(list[i]);
        }

        TreeSet<SEASONS[]> set = new TreeSet<>();

        set.add(SEASONS.values());

    }
}
