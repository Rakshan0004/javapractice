public class inherritance {

    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// Base class
class Animal {
    String color; // propertie

    void eat() { // function
        System.out.println("eats");
    }

    void breathe() { // function
        System.out.println("breathes");
    }

}

// Derived class / subclass
class Fish extends Animal { // extends is a keyword , indicates that a class is inherited from another class
    int fins; // propertie

    void swim() { // function
        System.out.println("swims in water");
    }
}
