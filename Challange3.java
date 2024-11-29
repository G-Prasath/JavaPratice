import java.util.Scanner;

public class Challange3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        System.out.print("Enter your Score : ");
        double score = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter your Dept : ");
        String dept = scan.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Score CGPA : " + score / 10);
        System.out.println("Dept : " + dept);
    }
}
