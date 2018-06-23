package by.it.prudnikau.lesson02;

import java.util.Formatter;
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
        int i1 = sc.nextInt();
        int i2 = i + i1;
        Formatter f = new Formatter();
        System.out.println("DEC:" + i + "+" + i1 + "=" + i2);

        String bin1 = Integer.toString(i, 2);
        String bin2 = Integer.toString(i1, 2);
        String bin3 = Integer.toString(i2, 2);
        System.out.println("BIN:" + bin1 + "+" + bin2 + "=" + bin3);

        String hex1 = Integer.toHexString(i);
        String hex2 = Integer.toHexString(i1);
        String hex3 = Integer.toHexString(i2);
        System.out.println("HEX:" + hex1 + "+" + hex2 + "=" + hex3);

        String octa1 = Integer.toOctalString(i);
        String octa2 = Integer.toOctalString(i1);
        String octa3 = Integer.toOctalString(i2);
        System.out.println("OCT:" + octa1 + "+" + octa2 + "=" + octa3);


    }


}
