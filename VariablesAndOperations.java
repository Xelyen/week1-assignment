package week1VariablesAndOperations;

public class VariablesAndOperations {
	
	public static void main(String[] args) {
		
		//create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 20;
		
		//create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 50.71;
		
		//create a variable to hold a person's middle initial
		char middleInitial = 'S';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean hotOutside = true;
		boolean coldOutside = false;
		
		//create a variable to hold a customer's first name
		String customerFirstName = "Kevin";
		
		//create a variable to hold a street address
		String streetAddress = "2696 Camino Del Rey";
		
		//print all varaibles to the console
		System.out.println("Available seats left on the plane: " + availablePlaneSeats);
		System.out.println("The Cost of Groceries: " + costOfGroceries);
		System.out.println("Middle Initial: " + middleInitial);
		System.out.println("Hot Outside: " + hotOutside);
		System.out.println("Cold Outside: " + coldOutside);
		System.out.println("First Name: " + customerFirstName);
		System.out.println("Street Address: " + streetAddress);
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats - 2; //availablePlaneSeats -=2; works the same
		System.out.println(availablePlaneSeats);
		
		//impulse candy bar purchase, add 2.15 to the grocery total
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'T';
		System.out.println(middleInitial);
		
		//the season has changed, update the hot outside variable to be the opposite of what it was
		hotOutside = false; //Can say !hotOutside, adding ! reverses boolean, pretty much flipping it
		System.out.println(hotOutside);
		
		//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		String customerLastName = "Hoang"; //dont' have to add last name string, can just add it at the end of out operations
		String fullName = customerFirstName + " " + middleInitial + " " + customerLastName;
		System.out.println(fullName);
		
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("Hello, my name is " + fullName + " and I live at: " + streetAddress + ".");
		
	}
}