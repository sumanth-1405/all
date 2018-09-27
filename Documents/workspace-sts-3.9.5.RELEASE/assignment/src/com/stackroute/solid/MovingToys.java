package com.stackroute.solid;

class MovingToys implements Toyable,Movable {

	public void price() {
		System.out.println("The price of toy is 200");
	}

	public void color() {
		System.out.println("The color of toy is orange");
	}

	public void move() {
		System.out.println("The toy can move on the land");
	}

}

