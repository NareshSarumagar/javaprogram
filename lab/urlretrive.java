package lab;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class urlretrive {
    public static void main(String agrs[]) throws Exception{
        URL url = new URL("https://wwww.google.com");

        BufferedReader obj = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        while ((line=obj.readLine())!=null){
            System.out.println(line);
        }
        obj.close() ;   
    }
}
