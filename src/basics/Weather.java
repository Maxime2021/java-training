package basics;

public class Weather {
	public static void main(String[] args) {
		// This program will give suggestions of what to wear based on the weather (temperature and sun condition)
		
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if(temperature > 80) {
			System.out.println("It's pleasent. Waer shorts and t-shirt");
		}
		else if((temperature > 60) && (sunCondition.equals("Sunny"))) {
			System.out.println("It's a little cooler. Perhaps waer a long-selver shirt and jeans.");
			System.out.println("Wear a hat to keep the sun out of your eyes");
		}
		else if(temperature > 50 ||(sunCondition.equals("Overcast"))) {
			System.out.println("This is a coool day, make sure to wear warm clothes");
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater");
		}
		
		System.out.println("The program is ending");
	}

}
