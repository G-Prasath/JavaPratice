class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Thread A is running");
                Thread.sleep(10);
            } catch (InterruptedException e) {
               System.out.println(e); 
            }
            
        }
    }
}

class B extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Thread B is running");
                Thread.sleep(10);
            } catch (InterruptedException e) {
               System.out.println(e); 
            }
        }
    }
}



public class Threads{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.setPriority(10); // set priority of thread a to 10
        b.setPriority(5); // set priority of thread b to 5

        a.start();
        b.start();

    }
}