class A implements Runnable{
    public void run(){
        System.out.println("Thread A is running");
    }
}


public class Runa {
    public static void main(String[] args) {
        A a = new A();

        Thread t1 = new Thread(a);
        t1.start();
    }
}
