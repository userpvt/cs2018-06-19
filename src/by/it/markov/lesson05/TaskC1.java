package by.it.markov.lesson05;
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

/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<int> fs = new ArrayList();
        ArrayList<int> f3 = new ArrayList();
        ArrayList<int> f2 = new ArrayList();
        ArrayList<int> fd = new ArrayList();
        for (int i = 0; i < 20; i++) {
            fs.add(); =sc.nextInt();
        }
        if (f3(1) % 3 == 0)
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 public class TaskC1 {
        public static void main(String[] args) throws Exception {
            ArrayList<Integer> fs = new ArrayList();
            ArrayList<Integer> f3 = new ArrayList();
            ArrayList<Integer> f2 = new ArrayList();
            ArrayList<Integer> fd = new ArrayList();
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 20; ) {
                fs.add(sc.nextInt());
                i++;
            }

            for (Integer n : fs) {
                if (n == 0){
                    fd.add(n);
                    continue;
                }
                if (n % 3 == 0)
                    f3.add(n);
                if (n % 2 == 0)
                    f2.add(n);
                if ((n % 2 != 0) && (n % 3 != 0))
                    fd.add(n);
            }
            printList(f3);
            printList(f2);
            printList(fd);
        }

        private static void printList(List<Integer> list) {
            for (Integer aList : list) System.out.println(aList);
        }
    }