package by.it.tumilovich.lesson02;

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
        System.out.print("Введите два целых числа: ");
        Scanner scanner=new Scanner(System.in);
        int i1=scanner.nextInt();
        int i2=scanner.nextInt();
        System.out.print("Sum = ");
        System.out.println(i1 + i2);
    }
}
