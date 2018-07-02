package by.it.varvashevich.lesson06;

public class DogHelper {
    static void printAllNames(Dog[] dogs){
        for (Dog dog:dogs){
            System.out.println(dog.getName()+" ");
        }
        System.out.println();
    }
    static double averageAge(Dog[] dogs){
        double sum=0;
        for (int i=0; i<dogs.length;i++){
            sum=sum+dogs[i].getAge();

        }return sum/dogs.length;
    }
}
