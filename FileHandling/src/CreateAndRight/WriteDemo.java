package CreateAndRight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

public class WriteDemo {
    public static void main(String[] args) {
      try{

          BufferedWriter writer = new BufferedWriter(new FileWriter("data/student.txt"));
          writer.write("\nName : Rahul");
          writer.newLine();
          writer.write("Course: Spring");
          writer.newLine();
          writer.write("Marks: 50");
          writer.close();

          System.out.println("Data written using bufferWriter");
      }
      catch (Exception e){
          e.printStackTrace();
      }
    }
}
