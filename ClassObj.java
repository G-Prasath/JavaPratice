import java.util.Scanner;

public class ClassObj {

    void oddEven(int num){
        if(num%2==0)
        {
            System.out.println(num+" is even");
        }
        else
        {
            System.out.println(num+" is odd");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = scan.nextInt();
        ClassObj oddoreven = new ClassObj();
        oddoreven.oddEven(num);
    }
}
