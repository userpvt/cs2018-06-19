package by.it.fedotova.lesson02;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человекана Марсе  и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51

// 3.86 *100 / 9.81 = 39.347
//39.347/100 * 75 = 29.51  0.39

*/
class TaskC3 {

       public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int k = in.nextInt();
        }

        public static double getWeight(double weight) {

            double z = 9.81;
            double y = 3.86;
            double n = y * 100.0 / z;
            double k = n / 100.0 * weight;

            double newDouble = new BigDecimal(k).setScale(2, RoundingMode.UP).doubleValue();

            return newDouble;

        }

}
