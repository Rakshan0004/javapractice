public class inherritance {

    public static void main(String args[]) {
        Dog tinku = new Dog();
        tinku.eat();
        tinku.legs = 4;
        System.out.println(tinku.legs);
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

class Mammals extends Animal {
    int legs;
}

class Dog extends Mammals {
    String breed;
}

// Derived class / subclass
// class Fish extends Animal { // extends is a keyword , indicates that a class
// is inherited from another class
// int fins; // propertie

// void swim() { // function
// System.out.println("swims in water");
// }
