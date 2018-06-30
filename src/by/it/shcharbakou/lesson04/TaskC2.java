package by.it.shcharbakou.lesson04;

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

public class TaskC2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int m = sc.nextInt();
        int jan = 31;
        int feb = 28;
        int mar = 31;
        int apr = 30;
        int may = 31;
        int jun = 30;
        int jul = 31;
        int aug = 31;
        int sep = 30;
        int oct = 31;
        int nov = 30;
        int dec = 31;

        switch (m) {
            case 1: if (d > jan){
                System.out.println("Incorrect date");
            } else System.out.println(d);
                break;
            case 2: if (d > feb){
                System.out.println("Incorrect date");
            } else System.out.println(d+jan);
                break;
            case 3: if (d > mar){
                System.out.println("Incorrect date");
            } else System.out.println(d+jan+feb);
                break;
            case 4: if (d > apr){
                System.out.println("Incorrect date");
            } else System.out.println(d+jan+feb+mar);
                break;
            case 5: if (d > may){
                System.out.println("Incorrect date");
            } else System.out.println(d+jan+feb+mar+apr);
                break;
            case 6: if (d > jun){
                System.out.println("Incorrect date");
            } else System.out.println(d+jan+feb+mar+apr+may);
                break;
            case 7: if (d > jul){
                System.out.println("Incorrect date");
            } else System.out.println(d+jan+feb+mar+apr+may+jun);
                break;
            case 8: if (d > aug){
                System.out.println("Incorrect date");
            } else System.out.println(d+jan+feb+mar+apr+may+jun+jul);
                break;
            case 9: if (d > sep){
                System.out.println("Incorrect date");
            } else System.out.println(d+jan+feb+mar+apr+may+jun+jul+aug);
                break;
            case 10: if (d > oct){
                System.out.println("Incorrect date");
            } else System.out.println(d+jan+feb+mar+apr+may+jun+jul+aug+sep);
                break;
            case 11: if (d > nov){
                System.out.println("Incorrect date");
            } else System.out.println(d+jan+feb+mar+apr+may+jun+jul+aug+sep+oct);
                break;
            case 12: if (d > dec){
                System.out.println("Incorrect date");
            } else System.out.println(d+jan+feb+mar+apr+may+jun+jul+aug+sep+oct+nov);
                break;
            default: System.out.println("Error");
        }

    }
}