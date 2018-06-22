package by.it.tumilovich.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите два целых числа: ");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int sum= number1 + number2;
        String binNumber1=Integer.toBinaryString(number1);
        String binNumber2=Integer.toBinaryString(number2);
        String binSum=Integer.toBinaryString(sum);
        String hexNumber1=Integer.toHexString(number1);
        String hexNumber2=Integer.toHexString(number2);
        String hexSum=Integer.toHexString(sum);
        String octNumber1=Integer.toOctalString(number1);
        String octNumber2=Integer.toOctalString(number2);
        String octSum=Integer.toOctalString(sum);
        System.out.println("DEC:" + number1 + "+" + number2 + "=" + sum);
        System.out.println("BIN:" + binNumber1 + "+" + binNumber2 + "=" + binSum);
        System.out.println("HEX:" + hexNumber1 + "+" + hexNumber2 + "=" + hexSum);
        System.out.println("OCT:" + octNumber1 + "+" + octNumber2 + "=" + octSum);



    }

}
