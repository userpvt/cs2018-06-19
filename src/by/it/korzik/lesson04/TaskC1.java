package by.it.korzik.lesson04;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
import java.util.Scanner;
public class TaskC1 {
    private static String numToMonth(int a){
        String s ="";
        switch (a){
            case 1:
                s = "январь"; break;
            case 2:
                s = "февраль"; break;
            case 3:
                s = "март"; break;
            case 4:
                s = "апрель"; break;
            case 5:
                s = "май"; break;
            case 6:
                s = "июнь"; break;
            case 7:
                s = "июль"; break;
            case 8:
                s = "август"; break;
            case 9:
                s = "сентябрь"; break;
            case 10:
                s = "октябрь"; break;
            case 11:
                s = "ноябрь"; break;
            case 12:
                s = "декабрь"; break;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Какую вы хотите зарплату в $$$?");
        double sal = scan.nextInt();
        if(sal<300|| sal>3000){
            System.out.println("Мы вам перезвоним!");
        }
        else{
            for(int i=0;i<=14;i++){
                if (i<1||i>12){
                System.out.println("За месяц "+i+" начислено $0.0");
                }
                else if (i>5&&i<9){
                    System.out.println("За "+numToMonth(i)+" начислено $"+sal);
                    if(sal==666){break;}
                }
                else{
                    System.out.println("За "+numToMonth(i)+" начислено $" + (sal*1.5));
                    if((sal*1.5)==666){break;}
                }
            }
        }
    }

}
