package by.it.markov.lesson04;

import java.util.Scanner;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner sc = new Scanner(System.in);
        int want = sc.nextInt();
        int fact;
        if (want < 300 || want > 3000){
            System.out.println("Мы вам перезвоним!");
        }
        for (int month = 0; month <= 14; month++) {
            if (month > 5 && month < 9) fact = want;
            else if (!(month > 0 && month < 13)) fact = 0;
            else fact = want + want / 2;
            String month1 = printMonth(month);
            System.out.println("За " + month1 + " начислено $" + fact + ".0");
            if (fact == 666) break;
        }
    }

    public static String printMonth(int number) {
        String month1;
        switch (number) {
            case 0:
                month1 = "месяц 0";
                break;
            case 1:
                month1 = "январь";
                break;
            case 2:
                month1 = "февраль";
                break;
            case 3:
                month1 = "март";
                break;
            case 4:
                month1 = "апрель";
                break;
            case 5:
                month1 = "май";
                break;
            case 6:
                month1 = "июнь";
                break;
            case 7:
                month1 = "июль";
                break;
            case 8:
                month1 = "август";
                break;
            case 9:
                month1 = "сентябрь";
                break;
            case 10:
                month1 = "октябрь";
                break;
            case 11:
                month1 = "ноябрь";
                break;
            case 12:
                month1 = "декабрь";
                break;
            case 13:
                month1 = "месяц 13";
                break;
            default:
                month1 = "месяц 14";
                break;
        }
        return month1;
    }
}