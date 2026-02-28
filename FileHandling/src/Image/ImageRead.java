package Image;

import java.io.FileInputStream;
import java.io.IOException;

public class ImageRead {
     public static void main(String[] args){
         String path = "Output/copied.png";
         try{
             FileInputStream fis = new FileInputStream(path);
             int size = 0;
             while(fis.read()!=-1){
                 size++;
             }
             fis.close();
             System.out.println("image read succcessfully");
             System.out.println("image size" + size + "byte");

         }catch (IOException e) {
             System.out.println("Error reading file: " + e.getMessage());
         }
     }
}
