import java.io.*;
public class FileReadExample{
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("E:/Amrita/example.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
        System.out.println("An error occurred while reading: " + e.getMessage());
    }
}
}
