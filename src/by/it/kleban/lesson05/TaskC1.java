package by.it.kleban.lesson05;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        ArrayList list1 = new ArrayList<>();
        ArrayList list2 = new ArrayList<>();
        ArrayList list3 = new ArrayList<>();
        for (int j = 0; j < 20; j++) {
            int x = sc.nextInt();
            list.add(x);
        }
        for (int i = 0; i < 20; i++) {
            if ((int) list.get(i) % 2 == 0) {
                list1.add(list.get(i));
            }
            if ((int) list.get(i) % 3 == 0) {
                list2.add(list.get(i));
            }
            if ((int) list.get(i) % 3 != 0 && (int) list.get(i) % 2 != 0) {
                list3.add(list.get(i));
            }
        }

        printList(list2);
       // System.out.println(" ");
        printList(list1);
        //System.out.println(" ");
        printList(list3);
    }

    private static void printList(ArrayList<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
