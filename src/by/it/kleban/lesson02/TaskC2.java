package by.it.kleban.lesson02;

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
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввод");

        int i = in.nextInt();
        int j = in.nextInt();
        int k = i+j;

        System.out.println("DEC:" + i + "+" + j + "=" + k);
        String ci = Integer.toBinaryString (i);
        String cj = Integer.toBinaryString (j);
        String ck = Integer.toBinaryString (k);
        System.out.println("BIN:" + ci + "+" + cj + "=" + ck);
        String hi = Integer.toHexString (i);
        String hj = Integer.toHexString (j);
        String hk = Integer.toHexString (k);
        System.out.println("HEX:" + hi + "+" + hj + "=" + hk);
        String oi = Integer.toOctalString (i);
        String oj = Integer.toOctalString (j);
        String ok = Integer.toOctalString (k);
        System.out.println("OCT:" + oi + "+" + oj + "=" + ok);
    }
}