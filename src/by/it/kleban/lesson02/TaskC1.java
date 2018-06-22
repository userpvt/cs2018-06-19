package by.it.kleban.lesson02;
import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
class TaskC1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввод");
        int i = in.nextInt();
        int j = in.nextInt();
        int k = i+j;
        System.out.println("Вывод \nSum =" + k);
    }
}




