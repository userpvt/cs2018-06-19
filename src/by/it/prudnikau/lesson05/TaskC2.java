package by.it.prudnikau.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mass = new int[20];
        for (int i = 0; i <mass.length ; i++) {
            mass[i] = sc.nextInt();
        }
        sort(mass);



    }






    public static void sort(int[] array) {
        int last = array.length;

        for ( boolean sorted = last == 0; !sorted; --last )
        {
            sorted = true;
            for ( int i = 1; i < last; ++i )
            {
                if ( array[i-1] < array[i] )
                {
                    sorted = false;

                    int tmp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = tmp;
                }
            }
        }
        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + "\n");
        }
    }

}
