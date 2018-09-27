package com.stackroute.assignment;

public abstract class Manager {
	
	public abstract String assigningServer(int id);
	public abstract String[] takingOrder(String user);
	public abstract String[] splitCategory(String[] order);
	public abstract boolean isContainsAlcohol(String[] drinks);
	public abstract boolean isLegalAge(int age);
	public abstract void notifyBartender(String[] drinks);
	public abstract void notifyChef(String[] food);
	public abstract boolean bartenderOrderCompleted();
	public abstract boolean chefOrderCompleted();
	public abstract void serve();
	

}
