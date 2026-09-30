package lab;
import java.net.URL;
import java.util.Scanner;
public class url {
    public static void main(String args[]) throws Exception{
        System.out.println("enter base url: ");
        Scanner c = new Scanner(System.in);
        String base1 = c.nextLine();


            URL base = new URL(base1);
            URL url = new URL(base,"laptop.html");
            System.out.println(url);


            URL base2 = new URL("https","www.google.com",8884,"/index.html");

            System.out.println(base2);
    }
}