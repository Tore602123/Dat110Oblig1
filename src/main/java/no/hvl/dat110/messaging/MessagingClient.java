package no.hvl.dat110.messaging;


import java.io.IOException;
import java.net.Socket;


public class MessagingClient {

	// name/IP address of the messaging server
	private String server = "127.0.0.1";;

	// server port on which the messaging server is listening
	private int port = 5000;
	
	public MessagingClient(String server, int port) {
		this.server = server;
		this.port = port;
	}
	
	// setup of a messaging connection to a messaging server
	public MessageConnection connect () {

		Socket clientSocket = null;
		try {
			clientSocket = new Socket(server, port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MessageConnection connection = new MessageConnection(clientSocket);
		
		// TODO - END
		return connection;
	}
}
