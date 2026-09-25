package lab;
import java.net.InetAddress;
import java.util.Scanner;


public class spamchecktry{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a host: ");

        String host = sc.nextLine();

        InetAddress address = InetAddress.getByName(host);

        System.out.println("Host: "+address.getByName(host));
        System.out.println("IP: "+address.getHostAddress());

        String hostname = address.getHostName().toLowerCase();

        if(hostname.contains("spam")||
            hostname.contains("free") || hostname.contains("winner") || hostname.contains("prize")){
                System.out.println("Result: Spam website....!!");
            }
            else{
                System.out.println("Result: Not spam webiste...!!");
            }
    }
}