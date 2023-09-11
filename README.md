This is a simple java program to display machine name and ip address of the host

## Source code

This is the source code of the program:

```import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetMachineNameAndIPAddress {

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
```

## Compile program

To compile the "Hello World" program, type the following:

```console
javac HelloWorld.java
```

## Excute the program

To execute the program, type this:

```console
java HelloWorld
```

