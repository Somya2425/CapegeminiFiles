package CreateAndRight;

import java.io.File;

public class CreateFile {
    public static void main(String[] args){
        File file = new File("data/student.txt");

        try{
            if(file.createNewFile()){
                System.out.println("file created");
            }
            else{
                System.out.println("file already exists");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
