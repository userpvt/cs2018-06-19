package by.it.gavrilenko.lesson02;

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
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int sum=i+j;
        String convert1 = Integer.toBinaryString(i);
        String convert2 = Integer.toBinaryString(j);
        String convert3 = Integer.toBinaryString(sum);
        String convert4 = Integer.toHexString(i).toLowerCase();
        String convert5 = Integer.toHexString(j).toLowerCase();
        String convert6 = Integer.toHexString(sum).toLowerCase();
        String convert7 = Integer.toOctalString(i);
        String convert8 = Integer.toOctalString(j);
        String convert9 = Integer.toOctalString(sum);
        System.out.println("DEC:"+i+"+"+j+"="+sum);
        System.out.println("BIN:"+convert1+"+"+convert2+"="+convert3);
        System.out.println("HEX:"+convert4+"+"+convert5+"="+convert6);
        System.out.println("OCT:"+convert7+"+"+convert8+"="+convert9);
    }


}
