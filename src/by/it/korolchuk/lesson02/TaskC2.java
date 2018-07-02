package by.it.korolchuk.lesson02;

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
        Scanner s = new Scanner(System.in);
        int i1 = s.nextInt();
        int i2 = s.nextInt();
        System.out.println("DEC" + ":" + i1 + "+" + i2 + "=" + (i1+i2));
        System.out.println("BIN" + ":" + (Integer.toBinaryString(i1)) + "+" + (Integer.toBinaryString(i2)) + "=" + (Integer.toBinaryString(i1+i2)));
        System.out.println("HEX" + ":" + (Integer.toHexString(i1)) + "+" + (Integer.toHexString(i2)) + "=" + (Integer.toHexString(i1+i2)));
        System.out.println("OCT" + ":" + (Integer.toOctalString(i1)) + "+" + (Integer.toOctalString(i2)) + "=" + (Integer.toOctalString(i1+i2)));

    }
}
