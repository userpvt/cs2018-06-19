package by.it.fedotova.lesson01;

// 1) Рассчитайте диапазон чисел для 8, 16 и 32 бит без знака

//Рассчитайте диапазон чисел для 8, 16 и 32 бит со знаком


/*Программа приведенного вида построит таблицу соответствия двоичных и десятичных чисел:
Доработайте ее так, чтобы кроме этих двух представлений были еще 8- ричные и 16-ричные числа
для типа данных byte, а вывод был от -128 до 127).
Для этого найдите аналоги метода Integer.toBinaryString

Аналоги: toHexString(int i) - возвращает число, кот является 16-ричным представлением входного аргумента
toOctalString(int i) - возвращает число, кот является 8-ричным представлением входного аргумента
*/
//i != -1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (byte i = - 128; i != 127; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");

            String hex = Integer.toHexString(i);
            if (hex.length() > 8) hex = hex.substring(hex.length() - 8);
            hex = String.format("%8s", hex).replace(" ", "0");

            String octal = Integer.toOctalString(i);
            if (octal.length() > 8) octal = octal.substring(octal.length() - 8);
            octal = String.format("%8s", octal).replace(" ", "0");

            System.out.printf("%8s %8s %8s %4d %n", octal, hex, binary, i);
            }
        }
    }



/*
public class Main {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
          int i = scn.nextInt();

        String binary = Integer.toHexString(i);
    //  if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
   //    binary = String.format("%8s", binary).replace(" ", "0");

            System.out.println(binary + " " + i);

        }
    }
*/
/*
public class Main {
    public static void main(String[] args) {
        for (byte i = - 128; i != 127; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");

            if (i < 0) {
                String hex = Integer.toHexString(i * (-i));
                String octal = Integer.toOctalString(i * (-i));
                System.out.printf("%8s %4d %8s %8s %n", binary, i, "-" + hex, "-" + octal);
            }
            else {
                String hex = Integer.toHexString(i);
                String octal = Integer.toOctalString(i);
                System.out.printf("%8s %4d %8s %8s %n", binary, i, hex, octal);
            }
        }
    }
}
*/