package week02.day03;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String getSound() {
        return "woof";
    }

    @Override
    public String toString() {
        return "Dog: " + getName() + " (" + this.breed + ") is " + getAge() + " years old and says " 
        + getSound(); 
    }
}
