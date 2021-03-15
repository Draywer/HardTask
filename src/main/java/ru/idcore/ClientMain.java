package ru.idcore;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 17117);

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(
                    new OutputStreamWriter(socket.getOutputStream()), true);
            Scanner scanner = new Scanner(System.in)) {

            String msg;
            while (true) {
                System.out.println("Enter message for server...");
                msg = scanner.nextLine();
                writer.println(msg);

                if(msg.equals("end")) {
                    break;
                }
                System.out.println("SERVER: " + reader.readLine());
            }
        }
    }
}
