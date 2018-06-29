package by.it.kuzmich.lesson04;

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
import java.util.Scanner;
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt(), month = sc.nextInt(),b = 0;

        for (int a = 1; a <= (month - 1); a++) {
            if (a == 2) {
                b += 28;
            }
             else if (a <= 7 && (a % 2) == 1) {
                b+=31;
            }
             else if (a <= 7 && (a % 2) != 1) {
                b+=30;
            }
             else if (a <= 7 && (a % 2) == 0) {
                b+=31;
            }
             else {
                b+=30;
            }

        }
        b+=day;
        System.out.println(b);
    }
}











