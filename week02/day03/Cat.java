package week02.day03;

public class Cat extends Animal {
    private String color;
    private boolean isIndoor;

    public Cat(String name, int age, String color, boolean isIndoor) {
        super(name, age, "meow");
        this.color = color;
        this.isIndoor = isIndoor;
    }

    @Override
    public String toString() {
        return "Cat: " + getName() + (isIndoor ? " (indoor)" : " (outdoor)") + " is " + this.color 
        + ", " + getAge() + " years old, and says " + getSound();
    }
    
}
