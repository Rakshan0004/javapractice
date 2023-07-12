public class constructorpractice {
    public int i;

    public static void main(String[] args) {

        constructorpractice cp = new constructorpractice(45);

        System.out.println(cp.i);
    }

    // default constructor if u dont add constructor then java willl add its known
    // as implicit constructor
    // constructor name always with class name
    // public constructorpractice() { // no return type in constructors
    // }
    public constructorpractice() { // parameterless constructor
        i = 20;
    }

    public constructorpractice(int a) { // parameter constructor
        i = a;
    }
}
