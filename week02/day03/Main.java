package week02.day03;

public class Main {
    
    public static void main(String[] args) {
        Animal a = new Animal("Meawson", 17, "woosh");
        Dog d = new Dog("Jack", 6, "labrador");
        Cat c = new Cat("lion", 11, "grey", true);

        Animal[] animals = new Animal[5];
        animals[0] = a;
        animals[1] = d;
        animals[2] = c;

        // Polymorphism
        Animal poly = new Dog("Wolfie", 5, "Shepherd");
        Animal anotherPoly = new Cat("Tiger", 4, "marble", false);
        
        animals[3] = poly;
        animals[4] = anotherPoly;

        System.out.println("");

        for (Animal animal: animals){
            System.out.println(animal);
        }

        System.out.println("");
    }
}
