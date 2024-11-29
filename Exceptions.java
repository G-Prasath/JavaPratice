import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        try {
            a = scan.nextInt();
            b = scan.nextInt();
            c = a / b;
        } catch (ArithmeticException e) {
           System.out.println("Arithmetic Exceptions");
        } catch (InputMismatchException e){
            System.out.println("Invalid Input");
        }

        if(c != 0){
            System.out.println("Final Result is a / b : "+ c);
        }else{
            System.out.println("Final Result is a / b : "+ "0");
        }
    }   
}
