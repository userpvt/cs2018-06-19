package by.it.pronovich.lesson05;
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
        ArrayList<String> list= new ArrayList<>();
        String a="Privet";
        String b="Man";
        String c="Kak tvoi dela ?";
        String d="Prive Poka";
        String e="Vasiliy";
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }

    }

}
