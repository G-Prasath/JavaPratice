final class _Test {
    final double PI = 3.14;
}

public class FinalClass extends _Test {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        System.out.println(fc.PI); // Output: 3.14
    }
}