package by.it.kleban.lesson04;

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
        int i = sc.nextInt();
        int j = sc.nextInt();
        int n=0;
        switch (j) {
            case 1:
                n = i;
                break;
            case 2:
                n = 31 + i;
                break;
            case 3:
                n = 31 + 28 + i;
                break;
            case 4:
                n = 31 + 28 + 31 + i;
                break;
            case 5:
                n = 31 + 28 + 31 + 30 + i;
                break;
            case 6:
                n = 31 + 28 + 31 + 30 + 31 + i;
                break;
            case 7:
                n = 31 + 28 + 31 + 30 + 31 + 30 + i;
                break;
            case 8:
                n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + i;
                break;
            case 9:
                n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + i;
                break;
            case 10:
                n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + i;
                break;
            case 11:
                n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + i;
                break;
            case 12:
                n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + i;



            default:
                System.out.println("нет такого месяца");

        }
        System.out.println(n);

    }
}

