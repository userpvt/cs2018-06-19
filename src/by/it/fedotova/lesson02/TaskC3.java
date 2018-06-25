package by.it.fedotova.lesson02;

//import java.math.BigDecimal;
//import java.math.RoundingMode;
import java.util.Scanner;

//import static by.it.fedotova.lesson02.TaskC3.getWeight;

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

// СПОСОБ 1 ОКРУГЛЕНИЕ BIGDECIMAL
// https://docs.oracle.com/cd/E13222_01/wls/docs45/classdocs/java.math.BigDecimal.html

//  class TaskC3 {
//      public static void main(String[] args) {
//          Scanner in = new Scanner(System.in);
//          int k = in.nextInt();
//          System.out.println(getWeight(k));
//        }
//        public static double getWeight(double weight) {
//          double z = 9.81;
//          double y = 3.86;
//          double n = y / z;
//          double k = n * weight;
//          double newDouble = new BigDecimal(k).setScale(2, RoundingMode.UP).doubleValue();
//          return newDouble;
//        }
//  }

// способ 2. решение разбирали на занятии

//class TaskC3 {
//        static double getWeight(int weight) {
//          double v = weight * 3.86 / 9.81;
//    int iw100=(int) v * 100;
//              double dw100=v * 100;
//              int iw100 =(int) dw100;
//             double delta=dw100-iw100;
//            if (delta >= 0.5)
//                  iw100++;
//              return (v * 100 / 100.0);
//          }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int we = scanner.nextInt();
//        double res = getWeight(we);
//       System.out.println(res);
//    }
//    }

// СПОСОБ 3.
class TaskC3 {
        static double z = 3.86;
        static double m = 9.81;

    static double getWeight(int x) {
        double a = x *z / m;
        double anew = a * 100;
        double b = (int) anew;
        double c = anew - b;
        if (c >= 0.5) {
            b++;
        }
        double res = b / 100;
        return res;
    }
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
      int we = scn.nextInt();
      double result = getWeight(we);
        System.out.println(result);
    }
}
