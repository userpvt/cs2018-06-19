package by.it.baidulena.lesson06;

public class DogHelper {
    public static void printAllNames(Dog[] dogs) {
        int i;
        for (i = 0; i < dogs.length; i++){
            System.out.print(
                dogs[i].getName()
                + ((i == dogs.length - 1) ? "\n" : " ")
            );
        }
//        System.out.println("");
    }
    public static double averageAge(Dog[] dogs){
        int sum = 0;
        for (Dog currentDog : dogs) {
            sum += currentDog.getAge();
        }
        return sum * 1.0/dogs.length;
    }
}
