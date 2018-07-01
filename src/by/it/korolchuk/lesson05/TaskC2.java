package by.it.korolchuk.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] m = new int[20];
        for (int i = 0; i <= m.length - 1; i++) {
            m[i] = sc.nextInt();
        }

        //public static void sort (int[] m) {

        Arrays.sort(m);

        for (int i = m.length - 1; i >= 0; i--) {
            System.out.println(m[i]);
        }
    }
}