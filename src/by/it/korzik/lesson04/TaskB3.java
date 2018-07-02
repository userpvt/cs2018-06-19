package by.it.korzik.lesson04;
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


 */


import java.util.Scanner;
public class TaskB3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(),b =0;
        for(int c =1;c<=a;c++){
            b+=c;
            if(b>a){
                break;
            }
            System.out.print(b+",");

        }
    }
}
