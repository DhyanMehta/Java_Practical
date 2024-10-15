import java.io.*;
public class Practical_31 {
    public static void main(String[] args) {
        try {
            FileWriter fout=new FileWriter("p31.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw=new BufferedWriter(fout);
            System.out.println("Enter a String: ");
            String s=br.readLine();
            bw.write(s);
            br.close();
            bw.close();
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
