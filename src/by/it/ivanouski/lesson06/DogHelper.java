package by.it.ivanouski.lesson06;

public class DogHelper {
    static void printAllNames(Dog[] dogs) {
        for (Dog dog : dogs) {
            System.out.print(dog.getName() + " ");

        }
    }
}
