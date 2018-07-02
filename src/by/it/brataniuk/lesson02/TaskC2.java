package by.it.brataniuk.lesson02;

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
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println("DEC:" + i + "+" + j + "=" + (i+j));
        String i1 = Integer.toBinaryString(i);
        String j1 = Integer.toBinaryString(j);
        int BIN = Integer.parseInt(i1, 2);
        int BIN2 = Integer.parseInt(j1, 2);
        System.out.println("BIN:" + i1 + "+" + j1 + "=" + Integer.toBinaryString(BIN + BIN2));
        String i2 = Integer.toHexString(i);
        String j2 = Integer.toHexString(j);
        String ii2 = Integer.toBinaryString(i);
        String jj2 = Integer.toBinaryString(j);
        int HEX = Integer.parseInt(ii2, 2);
        int HEX2 = Integer.parseInt(jj2, 2);
        System.out.println("HEX:" + i2 + "+" + j2 + "=" + Integer.toHexString(HEX + HEX2));
        String i3 = Integer.toOctalString(i);
        String j3 = Integer.toOctalString(j);
        String ii3 = Integer.toBinaryString(i);
        String jj3 = Integer.toBinaryString(j);
        int OCT = Integer.parseInt(ii3, 2);
        int OCT2 = Integer.parseInt(jj3, 2);
        System.out.println("OCT:" + i3 + "+" + j3 + "=" + Integer.toOctalString(OCT + OCT2));
        }
  }
