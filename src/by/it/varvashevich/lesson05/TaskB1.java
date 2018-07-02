package by.it.varvashevich.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;


public class TaskB1 {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        ArrayList list=new ArrayList();
        for (int i=0; i<5; i++)
        {String s = reader.readLine();
        list.add(s);
            }

        System.out.println(list.size());
     for (int i=0; i < list.size(); i++)
    {int j=list.size()-i-1;
        System.out.println(list.get(j));
    }
}}
