package by.it.fedotova.lesson05;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class TaskB2 {

    public static void main(String[] args) throws Exception {
        int list[] = new int[20];
        int a[] = new int[10];
        int b[] = new int[10];

       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
        }

        System.arraycopy(list, 0, a, 0, a.length);
        for (int i = 0; i < b.length; i++) {
            //   list[i] = Integer.parseInt(reader.readLine());
            b[b.length - 1 - i] = list[list.length - 1 - i];
        }
      //  a = Arrays.copyOfRange(list, 0, 9);
      //  b = Arrays.copyOfRange(list, 10, 20);

        for (int i = 0; i < b.length; i++) {
            System.out.println("a=" + Arrays.toString(a));
            System.out.println("b=" + Arrays.toString(b));break;
        }
    }
}



