package by.it.baidulena.lesson06;

/*
Доработайте класс Dog.

1) Добавьте два новых поля с геттерами и сеттерми (!!!!)
private int weight; //вес собаки
private double power; //сила укуса собаки

2) Напишите экземплярный метод в классе Dog
boolean win(Dog otherDog)
    {... тело метода...}
который рассчитывает, кто из двух собак победит эта (this) или та (otherDog).

Расчет должен быть таким.
    Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

Побеждает та собака, у которой больше шансов на победу.
Если победила эта (this), то метод win возвращает true, иначе false

3) Проверка.
В классе TaskC1 с клавиатуры через Scanner вводятся две собаки в формате
кличка возраст вес сила
кличка возраст вес сила
(всего получается 8 чтений разных данных)

Создайте этих собак, определите победителя с помощью созданного
в классе Dog метода boolean win(Dog dog).
Напечатайте кличку победителя.
*/


import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        int age1 = sc.nextInt();
        int weight1 = sc.nextInt();
        double power1 = sc.nextDouble();
        String name2 = sc.next();
        int age2 = sc.nextInt();
        int weight2 = sc.nextInt();
        double power2 = sc.nextDouble();
        Dog dog1 = new Dog(name1, age1, weight1, power1);
        Dog dog2 = new Dog(name2, age2, weight2, power2);
        boolean a = dog1.win(dog2);
        if (a == true){
            System.out.println(dog1.getName());
        }
        else System.out.println(dog2.getName());
    }
}
