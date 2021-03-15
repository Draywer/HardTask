package ru.idcore;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(17117);
        System.out.println("SERVER is running...");
        while (true) {

            try (Socket socket = serverSocket.accept();
                 PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                 BufferedReader reader = new BufferedReader(
                         new InputStreamReader(socket.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    assert false;
                    if (line.equals("end")) {
                        System.out.println("SERVER is stopped...");
                        break;
                    } else {
                        System.out.println("Client: "+ socket.getRemoteSocketAddress() + " - " + line + " - й член ряда Фибоначи?");
                        writer.println(line + " - й член ряда Фибоначи: " + Fibonachi.getNumber(Integer.parseInt(line)));
                    }
                }
                break;
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
