package by.it.baidulena.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {

    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int[] big = new int[20];
        for(int i = 0; i < 20; i++) {
            big[i] = sc.nextInt();
        }

        sort(big);

        for(int i = 0; i < big.length; i++) {
            System.out.println( big[i]);
        }

    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++ ) {
                if (array[j] > array[j-1]) {
                    int t = array[j];
                    array[j] = array[j-1];
                    array[j-1] = t;
                }

            }
        }

    }

}
