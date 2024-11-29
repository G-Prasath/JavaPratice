class InvalidAgeException extends Exception {
    public InvalidAgeException(String Msg){
        super(Msg);
    }
}

class AgeValidator{
    void checkAge(int age){
        try {
            if(age < 0 || age > 100){
                throw new InvalidAgeException("Age should be between 0 and 100");
            }else{
                System.out.println("Age is valid");
            }
        }catch (InvalidAgeException e) {
           System.out.println(e);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class PraticeException2 {
    public static void main(String[] args) {
        AgeValidator av = new AgeValidator();
        av.checkAge(180);
    }
}
