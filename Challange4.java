import java.util.Scanner;

public class Challange4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = scan.nextInt();

        if(a % 3 == 0){
            System.out.println("Divided in 3 RD Table");
        }else if( a % 5 == 0 ){
            System.out.println("Divided in 5 TH Table");
        }

    }
}
