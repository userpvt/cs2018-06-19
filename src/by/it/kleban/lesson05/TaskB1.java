package by.it.kleban.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] arg) {
        ArrayList<String> list = new ArrayList<>();
        list.add("qwe");
        list.add("qer");
        list.add("qwert");
        list.add("qwerty");
        list.add("asdf");
        list.set(0,"poiuyt");
        int i= list.size();
        System.out.println(i);

        for ( int j=0; j<i; j++){

            System.out.println(list.get(j));
        }


    }
}
