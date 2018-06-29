package by.it.brataniuk.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list[] = new int[5];
        for (int s = 0; s < list.length; s++) {
            list[s] = (sc.nextInt());
        }
        sort(list);
    }

    public static void sort(int[] array) {
        int a, b, t;
        for (a = 1; a < array.length; a++) {
            for (b = array.length - 1; b >= a; b--) ;
            if (array[b - 1] < array[b]) {
                t = array[b - 1];
                array[b - 1] = array[b];
                array[b] = t;
            }
        }
    }
}
