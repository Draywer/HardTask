package ru.idcore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(17117);

        while (true) {
            try (Socket socket = serverSocket.accept();
                 PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                 BufferedReader reader = new BufferedReader(
                         new InputStreamReader(socket.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.println("Echo: " + line);
                }
                assert false;
                if (line.equals("end")) {
                    break;
                }

            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
