package by.it.varvashevich.lesson04;

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
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int m=sc.nextInt();

        int q;
        for (q=1; q<=12;q++){
            switch (q){
                case 1:
                    if (m==1) System.out.println(d);
                    break;
                case 2:
                    if (m==2) System.out.println(d+31);
                    break;
                case 3:
                    if (m==3) System.out.println(d+31+28);
                    break;
                case 4:
                    if (m==4) System.out.println(d+31+28+31);
                    break;
                case 5:
                    if (m==5) System.out.println(d+31+28+31+30);
                    break;
                case 6:
                    if (m==6) System.out.println(d+31+28+31+30+31);
                    break;
                case 7:
                    if (m==7) System.out.println(d+31+28+31+30+31+30);
                    break;
                case 8:
                    if (m==8) System.out.println(d+31+28+31+30+31+30+31);
                    break;
                case 9:
                    if (m==9) System.out.println(d+31+28+31+30+31+30+31+31);
                    break;
                case 10:
                    if (m==10) System.out.println(d+31+28+31+30+31+30+31+31+30);
                    break;
                case 11:
                    if (m==11) System.out.println(d+31+28+31+30+31+30+31+31+30+31);
                    break;
                case 12:
                    if (m==12) System.out.println(d+31+28+31+30+31+30+31+31+30+31+30);
                    break;
            }

        }



    }
}
