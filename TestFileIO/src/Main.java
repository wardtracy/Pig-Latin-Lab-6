import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        File myFile;

        Scanner scan1 = new Scanner(System.in);

        myFile = new File( "Names.txt");
        PrintWriter p = new PrintWriter(new FileOutputStream(myFile, append: true));


    }
}
