package by.it.prudnikau.lesson06;

public class DogHelper {

    static void printAllNames(Dog[] dogs) {
        for (Dog dog : dogs) {
            System.out.print(dog.getName() + " ");
        }
        System.out.println();
    }

    static double averageAge(Dog[] dogs) {
        int a = dogs.length;
        double summ = 0;
        for (int i = 0; i < a; i++) {
            summ += dogs[i].getAge();

        }

        return summ / a;
    }
}
