package by.it.baidulena.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Collections;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
       Collections.addAll(list,"andreyandlena", "hotyat", "spat", "v6utra", "subbotu");
       int n = list.size();
       System.out.println(n);
       for (String x : list ){
        System.out.println(x);
       }
    }
}