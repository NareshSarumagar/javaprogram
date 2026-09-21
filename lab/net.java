package lab;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class net {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress address = InetAddress.getByName("142.251.157.4");
        System.out.println(address);
    }
}
