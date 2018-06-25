package by.it.tumilovich.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {
 public static void main(String[] args) {
     System.out.println("Введите четырехзначное число: ");
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();
     System.out.println("Сумма цифр введенного числа: " + sumDigitsInNumber(number));
 }
     static int sumDigitsInNumber(int number1){
         return (int) (number1 / 1000) + (number1 % 1000) / 100 + (number1 % 100) / 10 + (number1 % 10);
     }
}
