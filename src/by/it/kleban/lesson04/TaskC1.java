package by.it.kleban.lesson04;

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
        String[] mth = {"", "январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        System.out.println("Какую зарплату вы хотите?");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i < 300 || i > 3000) {
            System.out.println("Мы вам перезвоним!");
        } else {
            for (int j = 0; j <= 14; j++) {
                if (j == 0 || j == 13 || j == 14) {
                    System.out.println("За месяц " + j + " начислено $0.0");
                } else if (j == 6 || j == 7 || j == 8) {
                    System.out.println("За " + mth[j] + " начислено $" + i +".0");
                    if (i==666){
                        break;
                    }
                } else {
                    System.out.println("За " + mth[j] + " начислено $" + i * 1.5 );
                    if (i*1.5==666){
                        break;
                    }
                }

            }
        }
    }
}

