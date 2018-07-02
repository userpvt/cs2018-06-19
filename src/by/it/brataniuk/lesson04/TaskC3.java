package by.it.brataniuk.lesson04;

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
    public static void main(String args[]) {

        for (int b = 1; b <= 10; b++) {
            for (int b1 = 1; b1 <= 10; b1++) {
                int res = b * b1;
                String res1;
                if (sl(res).equals("error")) {
                    int m = Math.round(res / 10) * 10;
                    int m1 = res - m;
                    res1 = sl(m) + " " + sl(m1);
                } else res1 = sl(res);
                System.out.println(sl(b) + " умножить на " + sl(b1) + " равно " + res1);
            }
        }
    }
    public static String sl(int a) {
        String n;
        switch (a) {
            case 1:
                n = "один";
                break;
            case 2:
                n = "два";
                break;
            case 3:
                n = "три";
                break;
            case 4:
                n = "четыре";
                break;
            case 5:
                n = "пять";
                break;
            case 6:
                n = "шесть";
                break;
            case 7:
                n = "семь";
                break;
            case 8:
                n = "восемь";
                break;
            case 9:
                n = "девять";
                break;
            case 10:
                n = "десять";
                break;
            case 11:
                n = "одинадцать";
                break;
            case 12:
                n = "двенадцать";
                break;
            case 13:
                n = "тринадцать";
                break;
            case 14:
                n = "четырнадцать";
                break;
            case 15:
                n = "пятнадцать";
                break;
            case 16:
                n = "шестнадцать";
                break;
            case 17:
                n = "семнадцать";
                break;
            case 18:
                n = "восемнадцать";
                break;
            case 19:
                n = "девятнадцать";
                break;
            case 20:
                n = "двадцать";
                break;
            case 30:
                n = "тридцать";
                break;
            case 40:
                n = "сорок";
                break;
            case 50:
                n = "пятьдесят";
                break;
            case 60:
                n = "шестьдесят";
                break;
            case 70:
                n = "семьдесят";
                break;
            case 80:
                n = "восемьдесят";
                break;
            case 90:
                n = "девяносто";
                break;
            case 100:
                n = "сто";
                break;
            default:
                n = "error";
        }
        return n;
    }
}


