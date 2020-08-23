package com.networks.in;

public class Apple11Max {
	
private NetworkApi networkApi;

//setter injection 
public void setNetworkApi(NetworkApi networkApi) {
	this.networkApi = networkApi;
}



public void ConnectNetwork() {
	networkApi.calls();
	networkApi.data();
	networkApi.msgs();
}
//public Apple11Max(NetworkApi network) {
//	super();
//	this.network = network;
}
