package task0723;
import java.io.InterruptedIOException;

import static java.lang.Thread.sleep;

//package com.javarush.task.task07.task0723;

/*
Обратный отсчёт Ӏ Java Syntax: 7 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //напишите тут ваш код
        }

        System.out.println("Бум!");
    }
}































