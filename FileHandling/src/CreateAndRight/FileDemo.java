package CreateAndRight;
import java.io.File;
import java.util.*;
public class FileDemo {

    public static void main(String[] args) {
        File folder = new File("data1");

        if (!folder.exists()) {
            boolean created = folder.mkdir();

            if (created) {
                System.out.println("folder created");
            } else {
                System.out.println("folder not created");
            }
        } else {
            System.out.println("folder already created");
        }
    }
}
