package by.it.prudnikau.lesson02;
/*
Измените переменные и строку вывода в программе так,
чтобы она рассчитывала и печатала следующее выражение
3*3+4*4=25
 */

class TaskA3 {
    public static void main(String[] args) {
        int i = 3;
        int i1 = 3;
        int i2 = 4;
        int j = 4;
        int k = i * i1 + j * i2;
        System.out.println(i + "*" + i1 + "+" + j + "*" + i2 + "=" + k);
    }
}
