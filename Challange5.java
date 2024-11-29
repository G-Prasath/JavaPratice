public class Challange5 {
    public static void main(String[] args) {
        int b = 10;
        int sum = 0;

        for(int a = 1; a <= b; a++) {
            if(a % 2 == 0) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
