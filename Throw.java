import java.util.Scanner;
import java.util.InputMismatchException;

public class Throw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        try {
            int age = scan.nextInt();
            if (age < 1) {
                throw new ArithmeticException("Age Should be Grater then Zero");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

        System.out.println("Program Ended");
    }
}
