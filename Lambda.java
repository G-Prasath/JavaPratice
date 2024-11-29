interface A{
    void Disp();
}

public class Lambda {
    public static void main(String[] args) {

        // Inner Class

        // A a = new A(){
        //    public void Disp(){
        //     System.out.println("Hello");
        //    }
        // };

        // Lambda Expressions
        A a = () -> {
            System.out.println("Hello World");
        };

        a.Disp();
    }
}
