package by.it.loiko.lesson05;
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
        Collections.addAll(list, "a","b","c","d","e");


            /*for (int i = 0; i < 5; i++) {
             String str = list.get(i);
             list.add(Integer.toString(i));}*/

                System.out.println(list.size());

                for (String str : list)
                    System.out.println(str);

    }}










   /* public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String str = list.get(i);
            list.add(Integer.toString(i));
                             }

        for (int i = 0; i < list.size() ; i++) {
            String str = list.get(i);
            System.out.println(str);
        }

        for (String str : list)
            System.out.println(str);


    }

*/
