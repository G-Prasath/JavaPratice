interface Playable{
    int mark = 100;
    void play();
    default void Disp(){   // After Java 8 create function Body using default | static Keyword
        System.out.println("Interface Function Body");
    }
}

class Gittar implements Playable{
    public void play(){
        System.out.println("Gittar Played");
    }
    int mark = 500;
}

class Piano implements Playable{
    public void play(){
        System.out.println("Piano Played");
    }

}


public class InterfaceClass {
    public static void main(String[] args) {
        Gittar g = new Gittar();
        g.play();
        g.Disp();
        System.out.println(g.mark);
        
        Piano p = new Piano();
        p.play();
    }
}
