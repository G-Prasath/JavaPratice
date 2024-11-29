
class A extends Thread{
    int j = 0;
    public void run(){
        j = 50;
    }
}

public class Joins {
    public static void main(String[] args) {
        A a1 = new A();
        a1.start();
        try {
            a1.join();
        } catch (InterruptedException e) {
           System.out.println(e);
        }
        System.out.println(a1.j);
    }
}
