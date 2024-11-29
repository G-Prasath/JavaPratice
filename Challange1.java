import java.util.Scanner;

class Challange1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        System.out.print("Enter Your Age : ");
        int age = scan.nextInt();
        scan.nextLine();
        System.err.print("Enter Your Address : ");
        String address = scan.nextLine();

        System.out.println("My Name is " + name + " and I am " + age + " years old");
        System.err.println("My Address is " + address);
    }
}