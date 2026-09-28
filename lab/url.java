package lab;
import java.net.URL;
public class url {
    public static void main(String args[]) throws Exception{
            URL base = new URL("https://www.example.com/products/");
            URL url = new URL(base,"laptop.html");
            System.out.println(url);
    }
}
