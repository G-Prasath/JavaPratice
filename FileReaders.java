import java.io.FileReader;

public class FileReaders {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("output.txt");
            int c = 0;
            while (c != -1) {
                c = fr.read();
                System.out.print((char)c);
            }

            fr.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
