package by.it.tumilovich.lesson05;
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
        ArrayList<String> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        list.add("qqq");
        list.add("www");
        list.add("eee");
        list.add("rrr");
        list.add("ttt");
        /*for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }*/
        System.out.println(list.size());
        for (String j : list){
            System.out.println(j);
        }
    }
}
