package by.it.baidulena.lesson04;

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
/*
public class TaskC2 {
    public static int getMonth(int month) {
        int a = 31;
        int b = 30;
        int c = 28;
        switch (month) {
             case 1:
                return 0;
            case 3:
                return a + c;
            case 5:
                return a*2 + c + b;
            case 7:
                return a*3 + c + b*2;
            case 8:
                return a*4 + c + b*2;
            case 10:
                return a*5 + c + b*3;
            case 12:
                return a*6 + c + b*4;
            case 2:
                return c;
            case 4:
                return a*2 + c;
            case 6:
                return a*3 + c + b;
            case 9:
                return a*5 + c + b*2;
            case 11:
                return a*6 + c + b*4;
            default:
                return 0;

        }
    }
    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);
        int chislo = sc.nextInt();
        int month = sc.nextInt();
        System.out.println(getMonth(month) + chislo);
    }
}
*/

public class TaskC2 {
    public static int getMonth(int d) {
        int a = 31;
        int b = 30;
        int c = 28;
        switch (d) { //рапознает количество дней, исходя из месяца
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return a;
            case 2:
                return c;
            case 4:
            case 6:
            case 9:
            case 11:
                return b;
            default:
                return 0;
        }
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int chislo = sc.nextInt();
            int month = sc.nextInt();
            int days = 0;
            for (int d = 0; d < month; d++) { // количество полных месяцев, которые надо сосчитать
               days += (getMonth(d));
            }
            System.out.println(days + chislo);
        }

}


