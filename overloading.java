
public class overloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int i, int o, int r) {
        return i + o + r;
    }

    public static float sum(float f, float g) {
        return f + g;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.3f, 4.7f));
    }
}
