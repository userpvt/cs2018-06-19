package by.it.baidulena.lesson02;

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
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        String binaryI = Integer.toBinaryString(i);
        String binaryJ = Integer.toBinaryString(j);
        String octalI = Integer.toOctalString(i);
        String octalJ = Integer.toOctalString(j);
        String hexI = Integer.toHexString(i);
        String hexJ = Integer.toHexString(j);
        System.out.println("DEC:" + i + "+" + j + "=" + (i + j));
        System.out.println("BIN:" + binaryI + "+" + binaryJ + "=" + Integer.toBinaryString(i+j));
        System.out.println("HEX:" + hexI + "+" + hexJ + "=" +  Integer.toHexString(i+j));
        System.out.println("OCT:" + octalI + "+" +octalJ + "=" +  Integer.toOctalString(i+j));
    }


}
