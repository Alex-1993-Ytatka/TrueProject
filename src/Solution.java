//package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        Integer min = list.get(0).length();
        int countofmin = 0;
        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                countofmin = i;
            }

        }
        int countofmax = 0;
        Integer max = 0;
        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                countofmax = i;
            }

        }
        if (countofmax < countofmin) {
            System.out.println(list.get(countofmax));
            }
            else {
            System.out.println(list.get(countofmin));
                }
            }
        }//напишите тут ваш код































