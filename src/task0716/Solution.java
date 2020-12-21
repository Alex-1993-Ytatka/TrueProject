package task0716;

//package com.javarush.task.task07.task0716;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/*
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> finallist= new ArrayList<String>();
        for (String string : strings) {
            if (string.contains("р") & !(string.contains("л"))){
                continue;}

            if (string.contains("л") & !(string.contains("р"))){
                finallist.add(string);

            }
            finallist.add(string);

        }//напишите тут ваш код
        return finallist;
    }
}






























