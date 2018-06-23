package by.it.shcharbakou.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
import java.util.Scanner;

class TaskC1 {

     public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
                System.out.println("Input the 1st num:");
                int a = in.nextInt();
                System.out.println("Input the 2nd num:");
                int b = in.nextInt();
                int sum = a+b;
                System.out.println("Sum = "+sum);
           
        }
    }
