import java.util.Scanner;

public class Challange2 {
    public static void main(String[] args) {
        int a, b, c, d, e;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Number : ");
        a = scan.nextInt();
        System.out.print("Enter Your Second Number : ");
        b = scan.nextInt();
        System.out.print("Enter Your Thired Number : ");
        c = scan.nextInt();

        d = a * b * c;
        e = a + b + c;

        System.err.println("D / E : "+ d / e);

    }
}
