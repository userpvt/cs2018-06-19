package by.it.kuzmich.lesson02;

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
import java.util.Scanner;
class TaskC2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int n = scan.nextInt();
        int m = i +n;
        System.out.println("DEC:"+i+ "+"+n+ "="+ m);


        String bin1 = Integer.toBinaryString(i);
        String bin2 = Integer.toBinaryString(n);
        String bin3 = Integer.toBinaryString(m);
        System.out.println("BIN:" + bin1 +  "+" + bin2 + "=" + bin3);


        String hex1 = Integer.toHexString(i);
        String hex2 = Integer.toHexString(n);
        String hex3 = Integer.toHexString(m);
        System.out.println("HEX:" + hex1 + "+" + hex2 + "=" + hex3);


        String oct1  = Integer.toOctalString(i);
        String oct2 = Integer.toOctalString(n);
        String oct3 = Integer.toOctalString(m);
        System.out.println("OCT:" + oct1 + "+" + oct2 + "=" + oct3 );



    }

}
