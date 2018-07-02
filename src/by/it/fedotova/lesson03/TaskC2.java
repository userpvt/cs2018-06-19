package by.it.fedotova.lesson03;
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

    static int sumDigitsInNumber(int i) {
        int a = i / 100;
        int b = i / 1000;
        int c = b * 10;
        int newa = a - c;
        int d = i / 10;
        int a10 = a * 10;
        int newd = d - a10;
        int d10 = d * 10;
        int g = i - d10;
        int sum = b + newa + newd + g;
        return sum;
    }
   public static void main(String[] args) {
       System.out.println(sumDigitsInNumber(5467));
   }

}
