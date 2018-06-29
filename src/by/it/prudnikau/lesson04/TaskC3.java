package by.it.prudnikau.lesson04;

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

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class TaskC3 {
    public static void main(String[] args) {
        String umn = " умножить на ";
        String ravno = " равно ";
        List<String> numbers = Arrays.asList("ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь",
                "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
                "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать", "двадцать ", "тридцать ", "сорок ",
                "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто ", "сто");

        String a, b, c;
        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 10; j++) {
                int res = i * j;
                String result = "";
                String number = numbers.get(i);
                String number1 = numbers.get(j);
                if(res<20){
                    result=numbers.get(res);
                    System.out.println(number + umn + number1 + ravno+result);
                    continue;
                }
                if(res>=20&&res<30){
                    if(res==20){
                        result=numbers.get(20);
                        System.out.println(number + umn + number1 + ravno+result);
                        continue;
                    }
                    int t=res-20;
                    result=numbers.get(20)+numbers.get(t);
                    System.out.println(number + umn + number1 + ravno+result);
                    continue;
                }
                if(res>=30&&res<40){
                    if(res==30){
                        result=numbers.get(21);
                        System.out.println(number + umn + number1 + ravno+result);
                        continue;
                    }
                    int t=res-30;
                    result=numbers.get(21)+numbers.get(t);
                    System.out.println(number + umn + number1 + ravno+result);
                    continue;
                }
                if(res>=40&&res<50){
                    if(res==40){
                        result=numbers.get(22);
                        System.out.println(number + umn + number1 + ravno+result);
                        continue;
                    }
                    int t=res-40;
                    result=numbers.get(22)+numbers.get(t);
                    System.out.println(number + umn + number1 + ravno+result);
                    continue;
                }
                if(res>=50&&res<60){
                    if(res==50){
                        result=numbers.get(23);
                        System.out.println(number + umn + number1 + ravno+result);
                        continue;
                    }
                    int t=res-50;
                    result=numbers.get(23)+numbers.get(t);
                    System.out.println(number + umn + number1 + ravno+result);
                    continue;
                }
                if(res>=60&&res<70){
                    if(res==60){
                        result=numbers.get(24);
                        System.out.println(number + umn + number1 + ravno+result);
                        continue;
                    }
                    int t=res-60;
                    result=numbers.get(24)+numbers.get(t);
                    System.out.println(number + umn + number1 + ravno+result);
                    continue;
                }
                if(res>=70&&res<80){
                    if(res==70){
                        result=numbers.get(25);
                        System.out.println(number + umn + number1 + ravno+result);
                        continue;
                    }
                    int t=res-70;
                    result=numbers.get(25)+numbers.get(t);
                    System.out.println(number + umn + number1 + ravno+result);
                    continue;
                }
                if(res>=80&&res<90){
                    if(res==80){
                        result=numbers.get(26);
                        System.out.println(number + umn + number1 + ravno+result);
                        continue;
                    }
                    int t=res-80;
                    result=numbers.get(26)+numbers.get(t);
                    System.out.println(number + umn + number1 + ravno+result);
                    continue;
                }
                if(res>=90&&res<=99){
                    if(res==90){
                        result=numbers.get(27);
                        System.out.println(number + umn + number1 + ravno+result);
                        continue;
                    }
                    int t=res-90;
                    result=numbers.get(27)+numbers.get(t);
                    System.out.println(number + umn + number1 + ravno+result);
                    continue;
                }
                if(res==100){
                    result=numbers.get(28);
                    System.out.println(number + umn + number1 + ravno+result);
                    continue;
                }






            }

        }


    }


}
