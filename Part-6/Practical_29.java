import java.io.File;
import java.util.*;
public class Practical_29 {
    public static void main(String[] args) {
        try {
            String a,line;
            boolean found=false;
            int linenum=1;
            File f = new File("p29.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            Scanner sc=new Scanner(f);
            Scanner sc1=new Scanner(System.in);
            System.out.println("Enter a word to Search in File : ");
            a=sc1.nextLine();
            while(sc.hasNextLine()){
                line=sc.nextLine();
                if(line.contains(a)){
                    System.out.println("Word Found !!! ");
                    found=true;
                }
                linenum++;
                if(!found){
                    System.out.println("Word not Found!!!");
                }
            }
    }catch(Exception e){
        System.out.println(e);
    }
}
}
