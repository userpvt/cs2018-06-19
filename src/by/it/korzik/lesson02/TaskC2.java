package by.it.korzik.lesson02;
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
        int i = scan.nextInt(), a = scan.nextInt();
        int c = i + a;
        String bin = Integer.toBinaryString(i);
        String bina = Integer.toBinaryString(a);
        String ben = Integer.toBinaryString(c);
        String o1 = Integer.toOctalString(i);
        String o2 = Integer.toOctalString(a);
        String o3 = Integer.toOctalString(c);
        String h1 = Integer.toHexString(i);
        String h2 = Integer.toHexString(a);
        String h3 = Integer.toHexString(c);
        System.out.println("DEC:" + i + "+" + a + "=" + c);
        System.out.println("BIN:" + bin + "+" + bina + "=" + ben);
        System.out.println("HEX:" + h1 + "+" + h2 + "=" + h3);
        System.out.println("OCT:" + o1 + "+" + o2 + "=" + o3);


    }


}
