import java.net.InetAddress;
import java.net.UnknownHostException;

public class HelloWorld {

    public static void main(String[] args) throws UnknownHostException {
        // Get the machine name
        String machineName = InetAddress.getLocalHost().getHostName();

        // Get the machine IP address
        String machineIPAddress = InetAddress.getLocalHost().getHostAddress();

        // Print the machine name and IP address
        System.out.println("Machine name: " + machineName);
        System.out.println("Machine IP address: " + machineIPAddress);
    }
}
