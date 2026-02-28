package CreateAndRight;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteIntoFile {
    public static void main(String[] args) {
            try {
                doWrite();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
    public static void doWrite() throws IOException {
        FileWriter writer = new FileWriter("data/student.txt");
        writer.write("\nName : Rahul");
        writer.write("\n Course : Hindi");
        writer.write("\nMarks : 98");
        writer.close();
    }
}
