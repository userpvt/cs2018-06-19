package by.it.fedotova.lesson06;

/**
 * Created by user on 30.06.2018.
 */
public class Dog {
    private String name;
    private int age;
    private int weight;
    private double power;

    public Dog() {
    }

//статический полиморфизм
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
    //Принципы ООП:
// абстракция,
// инкапсуляция,
// полиморфизм - разное поведение для одного и того же метода, например, конструкторы;
// наследование -расширяет класс

    //динамический полиморфизм
    @Override
    public String toString() {
        return "Кличка: "+name+". Возраст: "+age;
    }
    boolean win(Dog otherDog){
        double myChance=0.2 * this.age + 0.3 * this.weight + 0.5 * this.power;
        double yourChance=0.2 * otherDog.age + 0.3 * otherDog.weight + 0.5 * otherDog.power;

        return myChance>yourChance;
    }
}
