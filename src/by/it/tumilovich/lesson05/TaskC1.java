package by.it.tumilovich.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
    1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> myList = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<20; i++){
            myList.add(sc.nextInt());
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (Integer a : myList) {
            if (a%3==0&&a%2==0){
                list1.add(a);
                list2.add(a);
            } else if(a%3==0&&a%2!=0){
                list1.add(a);
            } else if(a%3!=0&&a%2==0){
                list2.add(a);
            } else list3.add(a);
        }
        printList(list1);
        printList(list2);
        printList(list3);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);

    }


}
