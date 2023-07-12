public class abstractclass {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        System.out.println(h.color);
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }

    void eat() { // this is non abstract method
        System.out.println("animal eats");
    }

    abstract void walk(); // abstract method bcz we dont do implementation for object}

}

class Horse extends Animal {
    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks with 2 legs");
    }
}
