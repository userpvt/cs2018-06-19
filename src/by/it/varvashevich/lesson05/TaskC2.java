package by.it.varvashevich.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/


import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = arr.length - 1; i >= 0; i--)
            arr[i] = sc.nextInt();
        System.out.println();
    }



    public static void sort(int[] array) {
        int a, b, t;
        int size;
        size = array.length;
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (array[b - 1] > (array[b])) {
                    t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }


    }
}


