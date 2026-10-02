package lab;
import java.net.URLEncoder;
public class encoder {
    public static void main(String args[]) throws Exception{
        // String str = "https://www.google.com/search?q=java+programming";
        // String encodedStr = URLEncoder.encode(str, "UTF-8");
        // System.out.println("Encoded URL: " + encodedStr);

        String text = "Hello World! This is a test string.";
        String encodedText = URLEncoder.encode(text, "UTF-8");
        System.out.println("Encoded Text: " + encodedText);


        String decodedText = java.net.URLDecoder.decode(encodedText, "UTF-8");
        System.out.println("Decoded Text: " + decodedText);
    }
}
