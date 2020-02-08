package com.task2-maven.models.chocolate.sweets;


import com.task2-maven.models.sweets.Sweet;


public class QubaniKaMeetha extends Sweet {
	
private String Sweetname;

	public QubaniKaMeetha(int sugar, int sweet, int weight){

		super(sugar,sweet,weight);
	
}
	
public void setName(String name){
	
	Sweetname = name;
	
}

	public String getSweetname() {
	
	return Sweetname;
	
}
}
