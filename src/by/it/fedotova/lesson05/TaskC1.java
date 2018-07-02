package by.it.fedotova.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> others = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            list.add(Integer.valueOf(reader.readLine()));
        }
        for (int j : list) {
            if (j % 3 == 0 && j % 2 == 0) {
                list3.add(j);
                list2.add(j);
            } else if (j % 3 == 0) {
                list3.add(j);
            } else if (j % 2 == 0) {
                list2.add(j);
            } else {
                others.add(j);
            }
        }
        printList(list3);
        printList(list2);
        printList(others);
    }
    private static void printList(List<Integer> list) {
        for (Integer aList : list)
            System.out.println(aList);
    }
}
