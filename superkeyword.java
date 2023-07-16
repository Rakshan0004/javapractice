public class superkeyword {
    public static void main(String args[]) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super(); // this is keyword, java by default calls the construct, even if u dont write it
        super.color = "brown";
        System.out.println("horse constructor is called");
    }
}
