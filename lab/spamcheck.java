package lab;
import java.net.InetAddress;

public class spamcheck {
    public static void main(String agrs[]) throws Exception{
        String host = "example.com";
        InetAddress address = InetAddress.getByName(host);
        System.out.println("Host: "+address.getHostName());
        System.out.println("ip: "+address.getHostAddress());
    }
}
