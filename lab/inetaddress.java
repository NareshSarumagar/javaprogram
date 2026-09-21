package lab;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.UnexpectedException;

public class inetaddress {
    public static void main(String args[]) throws UnexpectedException, UnknownHostException{
        InetAddress[] address = InetAddress.getAllByName("google.com");
        for(InetAddress addresses:address){
            System.out.println("Host: "+addresses.getHostAddress()
        );
            System.out.println("IP: " + addresses.getHostAddress());
        }
    }
}
