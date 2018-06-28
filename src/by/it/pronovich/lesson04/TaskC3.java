package by.it.pronovich.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {
    public static void main(String[] args) {

        for (int i = 2; i <= 10; i++) {
            for (int b = 2; b <= 10; b++) {
                int y = b * i;
                System.out.println(intToString(i) + " умножить на " + intToString(b) + " равно " + intToString(y) + " ");
            }
        }
    }

    private static String intToString(int a) {
        if (a >= 1 && a <= 19) {

            switch (a) {
                case 1:
                    return "один";
                case 2:
                    return "два";
                case 3:
                    return "три";
                case 4:
                    return "четыре";
                case 5:
                    return "пять";
                case 6:
                    return "шесть";
                case 7:
                    return "семь";
                case 8:
                    return "восемь";
                case 9:
                    return "девять";
                case 10:
                    return "десять";
                case 11:
                    return "одиннадцать";
                case 12:
                    return "двенадцать";
                case 13:
                    return "тринадцать";
                case 14:
                    return "четырнадцать";
                case 15:
                    return "пятнадцать";
                case 16:
                    return "шестнадцать";
                case 17:
                    return "семнадцать";
                case 18:
                    return "восемнадцать";
                case 19:
                    return "девятнадцать";
                default:
                    return " ";
            }

        } else if (a >= 20 && a <= 99) {
            switch (a) {
                case 20:
                    return "двадцать";
                case 30:
                    return "тридцать";
                case 40:
                    return "сорок";
                case 50:
                    return "пятьдесят";
                case 60:
                    return "шестьдесят";
                case 70:
                    return "семьдесят";
                case 80:
                    return "восемьдесят";
                case 90:
                    return "девяносто";
                default: {
                    int b = a - a % 10;
                    int c = a % 10;
                    return intToString(b) + " " + intToString(c);
                }
            }

        } else if (a == 100) {
            return "сто";
        } else {
            return "";
        }
    }
}
