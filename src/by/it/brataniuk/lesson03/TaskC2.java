package by.it.brataniuk.lesson03;
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
        System.out.println(sumDigitsInNumber(5467));}

    public static int sumDigitsInNumber(int a){
    int a1 = a / 1000;
        //System.out.println(a1);
    int b1 = (a - a1*1000) / 100;
        //System.out.println(b1);
    int c1 = (a-a1*1000-b1*100)/10;
        //System.out.println(c1);
    int d1 = a%10;
        //System.out.println(d1);
    return (a1+b1+c1+d1);
    }
}



