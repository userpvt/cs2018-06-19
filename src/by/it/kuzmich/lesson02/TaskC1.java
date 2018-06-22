package by.it.kuzmich.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
    import java.util.Scanner;
class TaskC1 {
        public static void main(String args[]){
  Scanner scan = new Scanner(System.in);
    int n1 = scan.nextInt(), n2 = scan.nextInt();
    int n3 = n1 + n2;
    System.out.println("Sum =" + " " +n3 );}
}