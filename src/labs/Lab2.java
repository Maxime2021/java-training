package labs;

public class Lab2 {
	public static void main(String[] args) {
		//create a student 
		Student stu1 = new Student("Janelle","739234768");
		Student stu2 = new Student("Amedee","123456789");
		Student stu3 = new Student("Tom", "123456578");
		stu1.enroll("Math151");
		stu1.enroll("Eng255");
		stu1.enroll("History211");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.payTuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
		
	}

}
class Student{
	private static int iD= 10;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	
	
	private String courses="";
	private static final int costOfCourse = 800;
	private int balance= 0;
	
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setEmail(name);
		setUserId();
		
	}
	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	private void setEmail(String name) {
		this.email = name.toLowerCase()+"." +iD +"@smail.com";
		System.out.println("Your email is: "+ email);
	}
	
	public String getEmail() {
		return this.email;
	}
	
	private void setUserId() {
		int max = 90;
		int min = 10;
		int randNum = (int) (Math.random() *((max-min)));
		randNum = randNum + min;
		userId = iD + "" + randNum + ssn.substring(5);
		System.out.println("Your user ID: " +userId);
	}
	
	public void enroll(String course ) {
		this.courses = this.courses + " " + course;
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment: $" +amount);
		balance = balance - amount;
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	@Override
	public String toString() {
	 return "[NAME: "+ name + "]\n[COURSES: " + courses + "]\nBALANCE: " + balance + "]";	
	}
	
	
}
