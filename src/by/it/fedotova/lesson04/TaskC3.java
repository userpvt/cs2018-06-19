package by.it.fedotova.lesson04;

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
    public static void main(String[] args){

        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                    switch (i) {
                        case 1:
                            System.out.print("один умножить на");
                            if (a==1) System.out.println(" один равно один");
                            else if (a==2)System.out.println(" два равно два");
                            else if (a==3)System.out.println(" три равно три");
                            else if (a==4)System.out.println(" четыре равно четыре");
                            else if (a==5)System.out.println(" пять равно пять");
                            else if (a==6)System.out.println(" шесть равно шесть");
                            else if (a==7)System.out.println(" семь равно семь");
                            else if (a==8)System.out.println(" восемь равно восемь");
                            else if (a==9)System.out.println(" девять равно девять");
                            else System.out.println(" десять равно десять");
                            break;
                        case 2:
                            System.out.print("два умножить на");
                            if (a==1) System.out.println(" один равно два");
                            else if (a==2)System.out.println(" два равно четыре");
                            else if (a==3)System.out.println(" три равно шесть");
                            else if (a==4)System.out.println(" четыре равно восемь");
                            else if (a==5)System.out.println(" пять равно десять");
                            else if (a==6)System.out.println(" шесть равно двенадцать");
                            else if (a==7)System.out.println(" семь равно четырнадцать");
                            else if (a==8)System.out.println(" восемь равно шестнадцать");
                            else if (a==9)System.out.println(" девять равно восемнадцать");
                            else System.out.println(" десять равно двадцать");
                            break;
                        case 3:
                            System.out.print("три умножить на");
                            if (a==1) System.out.println(" один равно три");
                            else if (a==2)System.out.println(" два равно шесть");
                            else if (a==3)System.out.println(" три равно девять");
                            else if (a==4)System.out.println(" четыре равно двенадцать");
                            else if (a==5)System.out.println(" пять равно пятнадцать");
                            else if (a==6)System.out.println(" шесть равно восемнадцать");
                            else if (a==7)System.out.println(" семь равно двадцать один");
                            else if (a==8)System.out.println(" восемь равно двадцать четыре");
                            else if (a==9)System.out.println(" девять равно двадцать семь");
                            else System.out.println(" десять равно тридцать");
                            break;
                        case 4:
                            System.out.print("четыре умножить на");
                            if (a==1) System.out.println(" один равно четыре");
                            else if (a==2)System.out.println(" два равно восемь");
                            else if (a==3)System.out.println(" три равно двенадцать");
                            else if (a==4)System.out.println(" четыре равно шестнадцать");
                            else if (a==5)System.out.println(" пять равно двадцать");
                            else if (a==6)System.out.println(" шесть равно двадцать четыре");
                            else if (a==7)System.out.println(" семь равно двадцать восемь");
                            else if (a==8)System.out.println(" восемь равно тридцать два");
                            else if (a==9)System.out.println(" девять равно тридцать шесть");
                            else System.out.println(" десять равно сорок");
                            break;
                        case 5:
                            System.out.print("пять умножить на");
                            if (a==1) System.out.println(" один равно пять");
                            else if (a==2)System.out.println(" два равно десять");
                            else if (a==3)System.out.println(" три равно пятнадцать");
                            else if (a==4)System.out.println(" четыре равно двадцать");
                            else if (a==5)System.out.println(" пять равно двадцать пять");
                            else if (a==6)System.out.println(" шесть равно тридцать");
                            else if (a==7)System.out.println(" семь равно тридцать пять");
                            else if (a==8)System.out.println(" восемь равно сорок");
                            else if (a==9)System.out.println(" девять равно сорок пять");
                            else System.out.println(" десять равно пятьдесят");
                            break;
                        case 6:
                            System.out.print("шесть умножить на");
                            if (a==1) System.out.println(" один равно шесть");
                            else if (a==2)System.out.println(" два равно двенадцать");
                            else if (a==3)System.out.println(" три равно восемнадцать");
                            else if (a==4)System.out.println(" четыре равно двадцать четыре");
                            else if (a==5)System.out.println(" пять равно тридцать");
                            else if (a==6)System.out.println(" шесть равно тридцать шесть");
                            else if (a==7)System.out.println(" семь равно сорок два");
                            else if (a==8)System.out.println(" восемь равно сорок восемь");
                            else if (a==9)System.out.println(" девять равно пятьдесят четыре");
                            else System.out.println(" десять равно шестьдесят");
                            break;
                        case 7:
                            System.out.print("семь умножить на");
                            if (a==1) System.out.println(" один равно семь");
                            else if (a==2)System.out.println(" два равно четырнадцать");
                            else if (a==3)System.out.println(" три равно двадцать один");
                            else if (a==4)System.out.println(" четыре равно двадцать восемь");
                            else if (a==5)System.out.println(" пять равно тридцать пять");
                            else if (a==6)System.out.println(" шесть равно сорок два");
                            else if (a==7)System.out.println(" семь равно сорок девять");
                            else if (a==8)System.out.println(" восемь равно пятьдесят шесть");
                            else if (a==9)System.out.println(" девять равно шестьдесят три");
                            else System.out.println(" десять равно семьдесят");
                            break;
                        case 8:
                            System.out.print("восемь умножить на");
                            if (a==1) System.out.println(" один равно восемь");
                            else if (a==2)System.out.println(" два равно шестнадцать");
                            else if (a==3)System.out.println(" три равно двадцать четыре");
                            else if (a==4)System.out.println(" четыре равно тридцать два");
                            else if (a==5)System.out.println(" пять равно сорок");
                            else if (a==6)System.out.println(" шесть равно сорок восемь");
                            else if (a==7)System.out.println(" семь равно пятьдесят шесть");
                            else if (a==8)System.out.println(" восемь равно шестьдесят четыре");
                            else if (a==9)System.out.println(" девять равно семьдесят два");
                            else System.out.println(" десять равно восемьдесят");
                            break;
                        case 9:
                            System.out.print("девять умножить на");
                            if (a==1) System.out.println(" один равно девять");
                            else if (a==2)System.out.println(" два равно восемнадцать");
                            else if (a==3)System.out.println(" три равно двадцать семь");
                            else if (a==4)System.out.println(" четыре равно тридцать шесть");
                            else if (a==5)System.out.println(" пять равно сорок пять");
                            else if (a==6)System.out.println(" шесть равно пятьдесят четыре");
                            else if (a==7)System.out.println(" семь равно шестьдесят три");
                            else if (a==8)System.out.println(" восемь равно семьдесят два");
                            else if (a==9)System.out.println(" девять равно восемьдесят один");
                            else System.out.println(" десять равно девяносто");
                            break;
                        case 10:
                            System.out.print("десять умножить на");
                            if (a==1) System.out.println(" один равно десять");
                            else if (a==2)System.out.println(" два равно двадцать");
                            else if (a==3)System.out.println(" три равно тридцать");
                            else if (a==4)System.out.println(" четыре равно сорок");
                            else if (a==5)System.out.println(" пять равно пятьдесят");
                            else if (a==6)System.out.println(" шесть равно шестьдесят");
                            else if (a==7)System.out.println(" семь равно семьдесят");
                            else if (a==8)System.out.println(" восемь равно восемьдесят");
                            else if (a==9)System.out.println(" девять равно девяносто");
                            else System.out.println(" десять равно сто");
                            break;
                    }
                }
            }
        }
    }
