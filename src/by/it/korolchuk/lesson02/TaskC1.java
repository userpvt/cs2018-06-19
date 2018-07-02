package by.it.korolchuk.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
class TaskC1 {

        public static void main(String[] args) {
            Scanner s = new Scanner (System.in);
            System.out.println("Введите 2 числа");
            int i1 = s.nextInt();
            int i2= s.nextInt();
            System.out.println("Sum" +" " + "=" + " " + (i1 + i2));
        }

    }
