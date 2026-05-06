package week02.day03;

public class Animal {
    private String name;
    private int age;
    private String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSound() {
        return this.sound;
    }

    @Override
    public String toString() {
        return "Animal: " + this.name + ", is " + this.age + " years old and says " + this.sound;
    }
}
