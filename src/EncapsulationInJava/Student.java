package EncapsulationInJava;

public class Student {
	
	String name ;
	String Id;
	int rollNo;
	
	public String getName(){
		return name ;
	}
	public void setName(String name) {
		this.name = name ;
	}
	
	public String getId(){
		return Id ;
	}
	
	public void setID(String Id) {
		this.Id = Id ;
	}
	
	public int getrollNo(){
		return rollNo ;
	}
	
	public void setrollNo(int rollNo) {
		this.rollNo = rollNo ;
	}
}
