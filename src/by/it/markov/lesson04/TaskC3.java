package by.it.markov.lesson04;

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
        int i;
        int j;
        for (i = 2; i <= 10; i++) {
            String l = getNum(i);
            for (j = 2; j <= 10; j++) {
                String m = getNum(j);
                String n = getNum(i * j);
                System.out.println(l + " умножить на " + m + " равно " + n);
            }
        }
    }

    public static String getNum(int x) {
        String Num = "";
        if ((x > 9 && x < 20) || x == 100) {
            switch (x) {
                case 10:
                    Num = "десять";
                    break;
                case 11:
                    Num = "одиннадцать";
                    break;
                case 12:
                    Num = "двенадцать";
                    break;
                case 13:
                    Num = "тринадцать";
                    break;
                case 14:
                    Num = "четырнадцать";
                    break;
                case 15:
                    Num = "пятнадцать";
                    break;
                case 16:
                    Num = "шестнадцать";
                    break;
                case 17:
                    Num = "семнадцать";
                    break;
                case 18:
                    Num = "восемнадцать";
                    break;
                case 19:
                    Num = "девятнадцать";
                    break;
                case 100:
                    Num = "сто";
                    break;
            }
        } else {
            int a = x / 10;
            int b = x % 10;
            switch (a) {
                case 0:
                    Num = "";
                    break;
                case 2:
                    Num = "двадцать ";
                    break;
                case 3:
                    Num = "тридцать ";
                    break;
                case 4:
                    Num = "сорок ";
                    break;
                case 5:
                    Num = "пятьдесят ";
                    break;
                case 6:
                    Num = "шестьдесят ";
                    break;
                case 7:
                    Num = "семьдесят ";
                    break;
                case 8:
                    Num = "восемьдесят ";
                    break;
                case 9:
                    Num = "девяносто ";
                    break;
            }
            switch (b) {
                case 0:
                    Num = Num + "\b";
                    break;
                case 1:
                    Num = Num + "один";
                    break;
                case 2:
                    Num = Num + "два";
                    break;
                case 3:
                    Num = Num + "три";
                    break;
                case 4:
                    Num = Num + "четыре";
                    break;
                case 5:
                    Num = Num + "пять";
                    break;
                case 6:
                    Num = Num + "шесть";
                    break;
                case 7:
                    Num = Num + "семь";
                    break;
                case 8:
                    Num = Num + "восемь";
                    break;
                case 9:
                    Num = Num + "девять";
                    break;
            }
        }
        return Num;
    }
}