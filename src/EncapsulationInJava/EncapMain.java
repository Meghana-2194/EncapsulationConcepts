package EncapsulationInJava;

public class EncapMain {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("Tom");
		s.setID("564RTY");
		s.setrollNo(67);
		
		System.out.println("Name is " +s.getName());
		System.out.println("Id is " +s.getId());
		System.out.println("RollNumber is " +s.getrollNo());

	}

}
