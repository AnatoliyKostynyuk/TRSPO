package Lab4;

/**
 * Created by Nick Batist on 11/23/17.
 */
import java.net.*;
import java.io.*;

public class SocketClient {
    public static void main(String[] ar) {
        int port = 7777; // equals server port
        String address = "localhost";
        try {
            InetAddress ipAddress = InetAddress.getByName(address);
            System.out.println("Connecting IP address " + address + " and port " + port);
            Socket socket = new Socket(ipAddress, port);

            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();
            // for input and output String format
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            // create thread for reading from keyboard
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String message = null;

            while (true) {
                System.out.println("Type message to server");
                message = keyboard.readLine(); // wait while Enter pressed
                out.writeUTF(message); // send to server
                out.flush(); // complete data sending
                message = in.readUTF(); // wait server reponce
                System.out.println("Server send: " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
