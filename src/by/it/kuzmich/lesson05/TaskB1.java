package by.it.kuzmich.lesson05;
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
        String a = "A";
        for (int n = 0; n<=4; n++){
            list.add(a);

        }
        System.out.println(list.size());
        for (String a1 : list){
            System.out.println(a1);
        }

    }

}
