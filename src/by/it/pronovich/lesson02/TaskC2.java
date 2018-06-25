package by.it.pronovich.lesson02;

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
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        int b=sc.nextInt();
        int dec=i+b;
        String binaryI = Integer.toBinaryString(i);
        String binaryB = Integer.toBinaryString(b);
        String binary = Integer.toBinaryString(dec);
        String sixteenI = Integer.toHexString(i);
        String sixteenB = Integer.toHexString(b);
        String sixteen = Integer.toHexString(dec);
        String eightI = Integer.toOctalString(i);
        String eightB = Integer.toOctalString(b);
        String eight = Integer.toOctalString(dec);
        System.out.println("DEC:"+i+"+"+b+"="+dec);
        System.out.println("BIN:"+binaryI+"+"+binaryB+"="+binary);
        System.out.println("HEX:"+sixteenI+"+"+sixteenB+"="+sixteen);
        System.out.println("OCT:"+eightI+"+"+eightB+"="+eight);

    }


}
