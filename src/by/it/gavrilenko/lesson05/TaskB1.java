package by.it.gavrilenko.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        String[] Array=new String[5];
        Array[0]="qwer";
        Array[1]="asdf";
        Array[2]="zxcv";
        Array[3]="wert";
        Array[4]="sdfg";
        System.out.println(Array.length);
        for (int i = 0; i < Array.length; i++) {
            System.out.println(i);
            
        }


    }

}
