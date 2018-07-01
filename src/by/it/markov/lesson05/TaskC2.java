package by.it.markov.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> fs = new ArrayList();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; ) {
            fs.add(sc.nextInt());
            i++;
        }
        sort(fs);
        for (Integer p : fs)
            System.out.println(p);
        System.out.print("\b");
    }
    public static void sort(ArrayList<Integer> list)  {
        for (int a = 1; a < list.size(); a++) {
            for (int b = list.size() - 1; b >= a; b--) {
                if (list.get(b - 1) < list.get(b)) {
                    int temp = list.get(b - 1);
                    list.set((b - 1), list.get(b));
                    list.set(b, temp);
                }
            }
        }
    }
}