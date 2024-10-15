import java.io.File;
import java.util.*;
public class Practical_28{
    public static void main(String[] args) {
        int count=0;
        String line="",abc;
        char inp;

        try {
            File f = new File("p28.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            Scanner sc = new Scanner (f);
            Scanner s = new Scanner (System.in);
            System.out.println("Enter a character to find");
            abc=s.next();
            inp=abc.toLowerCase().charAt(0);
         
            while(sc.hasNextLine()){
                line=sc.nextLine();
                for(int i=0; i<line.length();i++){
                    if(inp==line.toLowerCase().charAt(i)){
                        count++;
                    }
            }
            System.out.println("Number of times "+ inp + " is present in file is " + count);
        } 
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}