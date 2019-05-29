import java.io.*;
public class Main {


    public static void main(String args[]) throws IOException{
        String dirname = "C:\\Users\\15009276686\\Desktop\\test";
        File tests = new File(dirname);
        if (tests.isDirectory()) {
            String s[] = tests.list();
            for (int i = 0; i < s.length; i++) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(dirname + "/" + s[i]));
                PrintWriter printWriter = new PrintWriter(dirname + "/" +"out"+ s[i]);
                Parse.parsing(bufferedReader,printWriter);
                bufferedReader.close();
                printWriter.close();
            }
        }
    }
}