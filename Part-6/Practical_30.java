import java.io.*;
import java.util.*;
public class Practical_30 {
public static void main(String[] args) {
    try {
        FileReader fin=new FileReader("P30_1.txt");
        FileWriter fout=new FileWriter("P30_2.txt");

        // System.out.println();
        String a="";
        Scanner sc=new Scanner(fin);
        while(sc.hasNext()){
            a=sc.nextLine();
            // sc.nextLine();
            fout.write(a);
        }
        fin.close();
        fout.close();

    } catch (Exception e) {
        System.out.println(e);
    }
}
}
