package by.it.prudnikau.lesson04;

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

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;


public class TaskC2 {
    public static void main(String[] args) {
        String date1 = "00.01.2018";
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        String a1="";
        String b1="";
        if (a < 10) {
            a1 = "0" + a;
        }
        if (b < 10) {
            b1 = "0" + b;
        }
        if (a >= 10) {
            a1 = Integer.toString(a);
        }
        if (b >= 10) {
            b1 = Integer.toString(b);
        }

        String date2 = a1+"."+ b1+".2018";
        System.out.println(date2);
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date dateOne = null;
        Date dateTwo = null;
        try {
            dateOne = format.parse(date2);
            dateTwo = format.parse(date1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Количество дней между датами в миллисекундах
        long difference = dateOne.getTime() - dateTwo.getTime();
        // Перевод количества дней между датами из миллисекунд в дни
        int days =  (int)(difference / (24 * 60 * 60 * 1000));
        System.out.println(days);




    }


}
