package by.it.fedotova.lesson04;
/*
С клавиатуры вводится некоторое число.
Пусть считается сумма int sum=1+2+3+4+5+... и т.д.
Каждая цифра суммы выводится в консоль через запятую (без пробела).
Остановите вывод до того, как сумма превысит введенное число.

Например:
Ввод:
122
Вывод:
1,3,6,10,15,21,28,36,45,55,66,78,91,105,120,

Ввод:
15
Вывод:
1,3,6,10,15,

Ввод:
14
Вывод:
1,3,6,10,
{\frac  {n(n+1)}{2}}

 */


import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
          int w = scn.nextInt();
         int i =1;
     while (i<((w / 2)-1)){
            int sum = (i * (i + 1)) / 2;
            System.out.print(sum + ",");
                i++;
            if (sum >= (w-i)-1) {
             break;
         }
         if (sum > (w-i)) {
             break;
         }
         System.out.print("");
            }
        }
    }

