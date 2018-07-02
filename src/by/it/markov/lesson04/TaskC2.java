package by.it.markov.lesson04;

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
        int day = sc.nextInt();
        int month = sc.nextInt();
        int N = day;
        switch (month){
            case 1:
                break;
            case 2:
                N += 31;
                break;
            case 3:
                N += 59;
                break;
            case 4:
                N += 90;
                break;
            case 5:
                N += 120;
                break;
            case 6:
                N += 151;
                break;
            case 7:
                N += 181;
                break;
            case 8:
                N += 212;
                break;
            case 9:
                N += 243;
                break;
            case  10:
                N += 273;
                break;
            case 11:
                N += 304;
                break;
            default:
                N += 334;
        }
        System.out.println(N);
    }
}
