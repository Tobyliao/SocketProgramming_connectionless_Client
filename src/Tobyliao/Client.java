package Tobyliao;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
	public static void main(String args[]) {
		String serverAddr="localhost";
		int server_port = 1111;
		String message="Hello! \n My name is Tobyliao \n My stdID is B10307108!";
		
		
		try {
			InetAddress address = InetAddress.getByName(serverAddr);
			DatagramPacket packet = new DatagramPacket(message.getBytes(),message.getBytes().length,address,server_port);
			DatagramSocket socket = new DatagramSocket();
			socket.send(packet);
			System.out.println("UDPClient: Sent data to Server ; Message = " + message);
			socket.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error in sending the Data to UDP Server");
		}
		
		
	}
}
