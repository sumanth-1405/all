package com.stackroute.assignment;

public class Server {
	private int serverId;
	private String user;
	public Server(int serverId, String user) {
		this.serverId=serverId;
		this.user=user;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getserverId() {
		return serverId;
	}

	public void setId(int serverId) {
		this.serverId = serverId;
	}

}
