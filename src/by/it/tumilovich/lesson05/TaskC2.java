package by.it.tumilovich.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
 11 2 5 6 7 16 8 9 10 12 4 13 14 15 17 18 19 20 3 6
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        int[] newList = new int [20];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<20; i++){
            newList[i]=sc.nextInt();
        }
        sort(newList);
    }

    public static void sort(int[] array) {
        boolean change=true;
        while (change){
            change = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                int num = array[j];
                array[j] = array[j + 1];
                array[j + 1] = num;
                change = true;
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
