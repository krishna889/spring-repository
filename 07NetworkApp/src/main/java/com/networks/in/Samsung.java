package com.networks.in;

public class Samsung {
	private NetworkApi network;
	// Constructor injection
public Samsung(NetworkApi network) {
		super();
		this.network = network;
	}
public void connectNetwork() {
	network.calls();
	network.data();
	network.msgs();
}

}
