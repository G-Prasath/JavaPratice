import java.util.Scanner;

class NotValidException extends Exception {
    public NotValidException(String s){
        super(s);
    }
}

public class CustomeException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int age = scan.nextInt();
            if(age<18){
                throw new NotValidException("You are not eligible to vote");
            }
        }catch(NotValidException e){
            System.out.println(e);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
