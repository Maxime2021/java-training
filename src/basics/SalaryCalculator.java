package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//Create a variable to define oue career
		
		//declare a variable
		String career;
		System.out.println("Our program is starting");
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		//Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate= 42.50;
		career = "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My slary as a " + career + " at the rate of $"+ rate + " per hour is $"+salary + " per year");
	}
}
