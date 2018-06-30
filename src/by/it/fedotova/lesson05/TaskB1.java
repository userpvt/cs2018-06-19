package by.it.fedotova.lesson05;
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
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Cat");
        arr.add("Dog");
        arr.add("Lion");
        arr.add("Fly");
        arr.add("Bird");
        int a = arr.size();
        System.out.println(a);
        for (int i=0; i < arr.size(); i++) {
            int j = arr.size() - i - 1;
            System.out.println(arr.get(j));
        }

        }
    }


