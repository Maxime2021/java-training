package basics;

public class Cities {

	public static void main(String[] args) {
		//Declare and define an Array(Datenfeld)
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		
		
		
		//Declare array
		String[]countries;
		
		//define the array
		countries= new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "Uk";
		
		

		String[] states = new String[5];
		states[0] = "california";
		states[1] = "Ohio";
		states[2] = "New Jersy";
		states[3] = "Texas";
		states[4] = "Utah";
		System.out.println(states[0]);
		
		int i = 0 ;
		
		
		// the do loop enters the loop then test conditoion
//		do {
//			System.out.println(states[i]);
//			i++;
//		}while(i < 5);
		
		int j = 0;
		boolean stateFound = false;
		while(!stateFound) {
			String state = states[j];
			System.out.println(state);
			if(state == "Texas") {
				System.out.println("State found! " + state);
				stateFound = true;
			}
			j++;
		}
		
		for(int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
		
		for(String state : states) {
			System.out.println(state);
		}
	}

}
