package by.it.baidulena.lesson03;
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
    public static int sumDigitsInNumber3(int number) {
        String a = Integer.toString(number); // Преобразуем число в строку
        int length = a.length(); // Получаем длину строки
        int sum = 0;

        for (int i = 0; i < length; ++i) { // Проходим по каждому символу в строке
            sum = sum + Character.digit(a.charAt(i),10); // Преобразуем символ в число и суммируем
        }
        return sum;
    }

    public static int sumDigitsInNumber2(int number) {
        int ostatok = number;
        int sum = 0;
        while (ostatok >= 1) { // Пока число обладает целой частью
            sum += ostatok % 10; // Получаем самое правое число
            ostatok = ostatok / 10; // Сокращаем число удалив самое правое
        }
        return sum;
    }

    public static int sumDigitsInNumber(int number) {
        int sum = number % 10; // Получаем правый символ
        int ostatok = number / 10; // Получаем остальные символы
        if (ostatok >= 1) { // Если остальные символы есть
            // Обрабатываем их по такому же принципу и приплюсовываем сумму остальных символов
            sum += sumDigitsInNumber(ostatok);
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber3(5467));
        System.out.println(sumDigitsInNumber2(5467));
        System.out.println(sumDigitsInNumber(5467));
    }

}
