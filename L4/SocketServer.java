package Lab4;

/**
 * Created by Nick Batist on 11/23/17.
 */
import java.net.*;
import java.io.*;

public class SocketServer {
    public static void main(String[] ar) {
        int port = 7777;
        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Waiting client");
            Socket socket = server.accept(); // wait connection
            System.out.println("Connection");

            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();
            // for input and output String format
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            String message = null;
            while (true) {
                message = in.readUTF(); // wait client message
                System.out.println("Client send: " + message);
                out.writeUTF(message); // send message to client
                out.flush(); // complete data sending
                System.out.println("Wait next line");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}