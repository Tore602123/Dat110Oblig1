package no.hvl.dat110.messaging;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static int MESSAGINGPORT = 8080;
	public static String MESSAGINGHOST = "localhost";

	public static byte[] encapsulate(Message message) {
		
		byte[] segment = null;
		byte[] data;

		segment = new byte[SEGMENTSIZE];
		data = message.getData();
        segment[0] = (byte) data.length;
        for (int i = 1; i < data.length + 1; i++) {
            segment[i] = data[i - 1];
		}
		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {

		byte[] data = new byte[segment[0]];
		for (int i = 0; i < data.length ; i++) {
			data[i] = segment[i+1];
		}

		Message message = new Message(data);
		return message;
	}
	
}
