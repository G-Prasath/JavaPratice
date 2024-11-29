import java.io.FileWriter;

public class FileWriter {
    public static void main(String[] args) {
        // Create a file writer
        try {
            FileWriter fw = new FileWriter("output.txt", true);    // true to append to file
            fw.append("Hello Man");
            fw.close();
            System.out.println("Success");
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
