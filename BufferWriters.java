import java.io.FileWriter;
import java.io.BufferedWriter;

public class BufferWriters {
    public static void main(String[] args) {
        // Create a file writer
        try {
            FileWriter fw = new FileWriter("output.txt", true);    // true to append to file
            BufferedWriter bw = new BufferedWriter(fw); // Create a buffered writer it store all text in memory before writing to file

            bw.write("Hay man Hello");
            bw.newLine();
            bw.write("How are you");
            bw.close();

            System.out.println("Success");
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
