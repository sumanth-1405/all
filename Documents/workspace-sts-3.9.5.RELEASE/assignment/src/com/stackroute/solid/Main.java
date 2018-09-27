package com.stackroute.solid;

public class Main {
	public static void main(String[] args) {
		Toyable obj = new Toys();
		obj.price();
		obj.color();
		Movable obj1=new MovingToys();
		obj1.move();
		FlyingToys obj2 = new FlyingToys();
		obj2.fly();

	}

}
