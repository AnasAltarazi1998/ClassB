package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        System.out.println(s);
        // File f = new File("test.txt");
        // if(!f.exists()) f.createNewFile();
        // FileWriter fw = new FileWriter(f,true);
        // fw.write(" hello zaid");
        // fw.flush();
        // FileReader fr = new FileReader(f);
        // BufferedReader br = new BufferedReader(fr);
        // System.out.println(br.readLine());
        //    String name = "adnan";
    //    String date = "2002/1/31";
    //    String lastname = "hakki";
    //    int national_id = 123123123;

    //    System.out.println("my name is : "+name);
    //    System.out.println("my birthday is : "+date);
    //    System.out.println("my lastname is : "+lastname);
    //    System.out.println("my national_id is : "+national_id);


        // try {
        //     connect("jdbcsql");
        //     System.out.println("done");
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

    }
    // public static void connect(String driverName) throws Exception{

    //     System.out.println("connecting to driver");
    //     if(!driverName.contains("::"))
    //         throw new Exception("unvalid name");

    // }

    // public static void fetchData(String type) throws Exception
    // {
    //     connect("jdbc::driver");
    // }
}
