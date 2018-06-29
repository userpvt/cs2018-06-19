package by.it.pronovich.lesson05;
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

    public static void main(String args[]) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            list1.add(Integer.parseInt(s));
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0 && list1.get(i) % 3 == 0) {
                list3.add(list1.get(i));
                list2.add(list1.get(i));
            } else if (list1.get(i) % 2 == 0) {
                list2.add(list1.get(i));
            } else if (list1.get(i) % 3 == 0) {
                list3.add(list1.get(i));
            } else {
                list4.add(list1.get(i));
            }

        }

        printList(list1);
        printList(list3);
        printList(list2);


        printList(list4);





/* for (Integer x: list1){
System.out.print(x+" ");
}

System.out.println();
for (Integer x: list2){
System.out.print(x+" ");
}
System.out.println();
for (Integer x: list3){
System.out.print(x+" ");
}
System.out.println();
for (Integer x: list4){
System.out.print(x+" ");
}
*/
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }

}


// }

//
//




