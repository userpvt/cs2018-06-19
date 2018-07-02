package by.it.kuzmich.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/
import java.util.Scanner;
public class TaskC2 {
    public static void main(String[] args) {
        int [] arr = new int[20];
        Scanner scan = new Scanner(System.in);
        for (int ind = 0; ind < arr.length ; ind++){
            int num = scan.nextInt();
            arr[ind] = num;
        }
        sort(arr);
    }

/*==========================================================================*/




    public static void sort(int[] array) {
        for (int length = array.length; length > 0; length--){
            for (int ind = 0; ind < length - 1; ind++){
                if (array[ind] < array[ind +1]){
                    int b = array[ind];
                    array[ind] = array[ind + 1];
                    array[ind +1] = b;

                }
            }
        }
        for (int i :array){
            System.out.println(i);
        }

    }

}
