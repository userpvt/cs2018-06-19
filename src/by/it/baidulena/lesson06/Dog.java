package by.it.baidulena.lesson06;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private double power;

    public Dog() {

    }

    public Dog(String name, int age) {

        this.name = name;
        this.age = age;
    }



    public Dog(String name, int age, int weight, double power) {

        this.name = name;
        this.age = age;
        this.power = power;
        this.weight = weight;
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

    @Override
    public String toString() {
        return  "Кличка: "+name+". Возраст: " + age;
    }


    public boolean win(Dog otherDog){
        double chance = 0.2 * otherDog.getAge() + 0.3 * otherDog.getWeight() + 0.5 * otherDog.getPower();
        double thisChance = 0.2 * this.getAge() + 0.3 * this.getWeight() + 0.5 * this.getPower();
        if (thisChance >  chance) {
            return true;
        }
        return false;
    }
}

