package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

public class DisplayStub extends RPCLocalStub {

	public DisplayStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public void write (int temp) {
		
		byte[] request = RPCUtils.marshallInteger(temp);
		
		byte[] response = rpcclient.call((byte)Common.READ_RPCID, request);
		// implement marshalling, call and unmarshalling for write RPC method
		RPCUtils.unmarshallVoid(response);
		
		// TODO - END
		
	}
}
