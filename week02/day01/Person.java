package week02.day01;

// A CLASS: A class is a blueprint for creating objects and defines what the object can do.
// AN OBJECT: An object is an instance of a class (blueprint) with actual data.

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(){

    }

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + ", " + this.email;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25, "alice@email.com");
        Person p2 = new Person("Rob", 28, "rob@email.com");
        Person p3 = new Person("Thomas", 35, "thomas@email.com");
        Person p4 = new Person("John", 95, "john@email.com");
        Person p5 = new Person("Joshua", 79, "joshua@email.com");

        System.out.println("");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println("");
    }
}
