package by.it.brataniuk.lesson04;

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
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < m; i++) {
            sum = sum + countdays(i);
        }
        System.out.println(sum + d);
    }
    public static int countdays(int i) {
        int day;
        if (i == 4 || i == 6 || i == 9 || i == 11) {
            day = 30;
        } else if (i == 2) {
            day = 28;
        } else day = 31;
        return day;
    }
}


