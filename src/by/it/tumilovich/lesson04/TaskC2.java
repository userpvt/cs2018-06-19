package by.it.tumilovich.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        System.out.println("Введите число и месяц: ");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int month=sc.nextInt();
        int sum=0;
        int[] array={31,28,31,30,31,30,31,31,30,31,30,31};
        while (month>1){
            sum+=array[month-2];
            month--;
        }
        System.out.println(sum+=day);
    }
}
