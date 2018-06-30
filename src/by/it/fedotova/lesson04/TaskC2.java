package by.it.fedotova.lesson04;

import java.awt.*;
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
        Scanner scn = new Scanner(System.in);
        int d = scn.nextInt();
        int m = scn.nextInt();
        while (m <= 12) {
            switch (m) {

                case (1):
                    int result = d;
                    System.out.println(result);break;
                case (2):
                    int result1 = 31 + d;
                    System.out.println(result1);break;

                case (3):
                    int result2 = 59 + d;
                    System.out.println(result2);break;
                case (4):
                    int result3 = 31 + 28 + 31 + d;
                    System.out.println(result3);break;
                case (5):
                    int result4 = 120 + d;
                    System.out.println(result4);break;
                case (6):
                    int result15 = 151 + d;
                    System.out.println(result15);break;
                case (7):
                    int result6 = 181 + d;
                    System.out.println(result6);break;
                case (8):
                    int result7 = 212 + d;
                    System.out.println(result7);break;
                case (9):
                    int result8 = 243 + d;
                    System.out.println(result8);break;
                case (10):
                    int result9 = 273 + d;
                    System.out.println(result9);break;
                case (11):
                    int result10 = 304 + d;
                    System.out.println(result10);break;
                case (12):
                    int result11 = 334 + d;
                    System.out.println(result11);break;
            }
            break;
        }
    }
}
