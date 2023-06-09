package no.hvl.dat110.messaging;


public class Message {

	// the up to 127 bytes of data (payload) that a message can hold
	private byte[] data;

	// construction a Message with the data provided
	public Message(byte[] data) {
		
		if (data != null && data.length < MessageUtils.SEGMENTSIZE) {
			this.data = data;
		} else {
			System.out.println("Too many bytes");
		}
	}
	public byte[] getData() {
		return this.data; 
	}

}
