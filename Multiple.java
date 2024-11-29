interface Readable {
   void Read();
}

interface Writeable {
    void Write();
}

interface Storeable {
   void Store();
}



class C implements Readable, Writeable, Storeable {
    public void Read() {
        System.out.println("Reading");
    }
    public void Write() {
        System.out.println("Writing");
    }
    public void Store() {
        System.out.println("Storing");
    }
}


public class Multiple {
    public static void main(String[] args) {
        C c1 = new C();
        c1.Read();
        c1.Write();
        c1.Store();
    }
}
