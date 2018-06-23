package by.it.loiko.lesson02;
import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
class TaskC1 {

public static void main(String[] args ) {

        Scanner sc1=new Scanner(System.in);

        int a = sc1.nextInt();
        int b = sc1.nextInt();

        System.out.println("Sum = "+(a+b));

    }

}

