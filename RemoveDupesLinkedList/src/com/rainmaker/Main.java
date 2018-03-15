package com.rainmaker;

import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);

        removeDupes(list);
    }

    private static void removeDupes(LinkedList list) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
           if (!set.contains(list.get(i))) {
               set.add((Integer) list.get(i));
           } else {
               list.remove(i);
               i--;
           }
        }
        System.out.println(list);
    }
}
