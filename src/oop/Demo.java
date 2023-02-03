package oop;

class Person{
	private String name;
	private String email;
	private String phone;
	
	Person(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	 void walk() {
		System.out.println(this.name + " is walking");
	}
	
	void eat() {
		System.out.println(this.name + " is eating");
	}
	
	void sleep() {
		System.out.println(this.name + " is sleeping");
	}
	
}

public class Demo {
	public static void main(String[] args) {
		
		Person person1 = new Person("Joe", "joe.wilson@gmail.com", "011322394");
		
		person1.walk();

		
		person1.sleep();
		
		Person person2 = new Person("Sahra", "sahra.smith@gmail.com", "48553405");
		
//		String name = "Joe";		
//		String email ="joe.willson@gmail.com";
//		String phone ="015770204567";
//		
//		System.out.println(name + " is walking");
//		System.out.println(name + " is eating");
		
	}
	
//	static void walking(String name) {
//		System.out.println(name + " is walking");
//	}
}

