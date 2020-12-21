package task0718;
//package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
             }
        Integer wrong = 0;
        for (int i = 0; i < 4; i++) {
            if (list.get(i).length()>list.get(i+1).length()){
                wrong = i+1;
                break;
            }
        }
        if (wrong!=0){
        System.out.println(wrong);}//напишите тут ваш код
    }
}































