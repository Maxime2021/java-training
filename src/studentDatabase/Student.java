package studentDatabase;

public class Student {
	private String ssn;
	private String name;
	private static final int iD = 1001;
	private String email;
	private int userID;

	public Student(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public void createEmail(String name) {
		email = name + "@gmail.com";
	}
}
