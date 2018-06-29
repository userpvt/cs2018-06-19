package by.it.pronovich.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskC2 {
    public static void main(String[] args)  throws Exception{
        BufferedReader reader= new BufferedReader( new InputStreamReader(System.in));
        int[] mas = new int[20];
        for (int i=0; i<mas.length; i++){
            mas[i]=Integer.valueOf(reader.readLine());
        }
        //for (int ma : mas) {
         //   System.out.print(ma+ " ");

       // }
        sort(mas);
        System.out.println();
        for (int ma : mas) {
            System.out.println(ma);

        }
    }




    public static void sort(int[] array) {
        for (int j=0; j< array.length; j++){


        for (int i = 0; i < array.length-1; i++) {
            if (array[i]<=array[i+1]){
                int temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
        }

        }
        }
    }

}
