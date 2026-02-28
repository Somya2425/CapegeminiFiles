package Image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageStore {
    public static void main(String[] args){
        String sourcePath = "'/Users/admin/Desktop/Screenshot 2026-02-20 at 11.32.22 AM.png'";
        String destinationPath = "Output/copied.png";

        try{
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destinationPath);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while((bytesRead = fis.read(buffer))!= -1){
                fos.write(buffer, 0, bytesRead);
            }
            fis.close();
            fos.close();
            System.out.println("Image stored successfully");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
