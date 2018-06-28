package by.it.korolchuk.lesson04;

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
        System.out.println("Введите число и номер месяца");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int Jan = 31;
        int Feb = 28;
        int Mar = 31;
        int Apr = 30;
        int May = 31;
        int June = 30;
        int Jul = 31;
        int Aug = 31;
        int Sep = 30;
        int Oct = 31;
        int Nov = 30;


        switch (month) {

            case 1: {
                System.out.println(day);
                break;
            }

            case 2:
                System.out.println(Jan + day);
                break;

            case 3:
                System.out.println(Jan + Feb + day);
                break;

            case 4:
                System.out.println(Jan + Feb + Mar + day);
                break;

            case 5:
                System.out.println(Jan + Feb + Mar + Apr + day);
                break;

            case 6:
                System.out.println(Jan + Feb + Mar + Apr + May + day);
                break;

            case 7:
                System.out.println(Jan + Feb + Mar + Apr + May + June + day);
                break;

            case 8:
                System.out.println(Jan + Feb + Mar + Apr + May + June + Jul + day);
                break;

            case 9:
                System.out.println(Jan + Feb + Mar + Apr + May + June + Jul + Aug + day);
                break;

            case 10:
                System.out.println(Jan + Feb + Mar + Apr + May + June + Jul + Aug + Sep + day);
                break;

            case 11:
                System.out.println(Jan + Feb + Mar + Apr + May + June + Jul + Aug + Sep + Oct + day);
                break;

            case 12:
                System.out.println(Jan + Feb + Mar + Apr + May + June + Jul + Aug + Sep + Oct + Nov + day);
                break;

        }
    }
}




