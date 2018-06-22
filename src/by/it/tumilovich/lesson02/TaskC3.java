package by.it.tumilovich.lesson02;

import java.util.Scanner;
import java.lang.Math;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
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


*/
class TaskC3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int weight1=scanner.nextInt();
        double weight2=getWeight(weight1);
        System.out.println(weight2);

    }

    private static double getWeight(int w1){
        double gMars = 3.86;
        double gEarth = 9.81;
        return Math.rint(w1*gMars*100/gEarth)/100;
    }
}
