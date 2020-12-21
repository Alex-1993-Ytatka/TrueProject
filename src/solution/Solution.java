package solution;
//package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Integer s = Integer.parseInt(reader.readLine());
            list.add(s);
                    }
        printList(list);
    }//напишите тут ваш код

    public static void printList(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {

            if (list.get(i) % 3 == 0) {
                list1.add(list.get(i));
            }
            if (list.get(i) % 2 == 0) {
                list2.add(list.get(i));
            }
            if (list.get(i) % 3 != 0 & list.get(i) % 2 != 0) {
                list3.add(list.get(i));
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
    }
}






























