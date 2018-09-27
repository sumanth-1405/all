package com.stackroute.assignment;

public class PubUserQuery extends PubUserQueryProcessing() {
	private String user;
	public PubUserQuery(String user){
		this.user=user;
		
	}



@Override
public String assigningServer(int id) {

	return null;
}

@Override
public String[] takingOrder(String user) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String[] splitCategory(String[] order) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean isContainsAlcohol(String[] drinks) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isLegalAge(int age) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void notifyBartender(String[] drinks) {
	// TODO Auto-generated method stub
	
}

@Override
public void notifyChef(String[] food) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean bartenderOrderCompleted() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean chefOrderCompleted() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void serve() {
	// TODO Auto-generated method stub
	
}
}
