public class Finally {
    public static void main(String[] args) {
        int err = 0;

        try {
            int a = 10 / 1;
            err = 0;
        } catch (Exception e) {
            err = 1;
        }finally{
            if(err == 1){
                System.out.println("Error Occured");
            }else{
                System.out.println("No Error");
            }
        }
    }
}
