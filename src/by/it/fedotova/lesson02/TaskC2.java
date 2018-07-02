package by.it.fedotova.lesson02;

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
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        System.out.println("DEC:" + n + "+" + m + "=" + (n + m));
        System.out.println("BIN:" + Integer.toBinaryString(n) + "+" + Integer.toBinaryString(m) + "=" + Integer.toBinaryString(n + m));
        System.out.println("HEX:" + Integer.toHexString(n) + "+" + Integer.toHexString(m) + "=" + Integer.toHexString(n + m));
        System.out.println("OCT:" + Integer.toOctalString(n) + "+" + Integer.toOctalString(m) + "=" + Integer.toOctalString(n + m));
    }
}
