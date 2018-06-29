package by.it.korzik.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        String s ="A";
        for (int a =0; a<=4;a++) {
            list.add(s);
        }
        System.out.println(list.size());
        for (String s1 : list) {
            System.out.println(s1);
        }
    }
}
