package by.it.prudnikau.lesson05;
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
        ArrayList<String> list = new ArrayList<>();
        list.add("петя ");
        list.add("васяколя");
        list.add("катяюля");
        list.add("васька");
        list.add("николай");

        int t=list.size();
        System.out.println(t);
        for (String s:list) {
            System.out.println(s);
        }



    }

}
