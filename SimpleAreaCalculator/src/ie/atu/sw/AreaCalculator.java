package ie.atu.sw;

import java.util.Scanner; //ctrl + shift + o to import missing library
// java.util.* = import everything in the util directory

public class AreaCalculator {

	//Instance variables
	private Scanner scanner; //vis mod + Class name + Identifier
	
	//Add skeleton of class, wire it together later
	
	public AreaCalculator() { //Constructor method
		scanner = new Scanner(System.in); //Adds read-in functionality from command line/console
		
		init();
		processInput();
		
	}
	
	public void calcAreaCircle () {
		System.out.println("Enter the radius>");
		String input = scanner.next();
		double radius = Double.parseDouble(input);
		double area = Math.PI * (radius * radius); //Area = pi(radius^2)
		System.out.println("Area of Circle: " + area);
	}
	
	public void calcAreaTriangle () {
		//Get user data for width
		System.out.println("Enter the width>"); //Give user instruction
		String input = scanner.next(); //Get the value from the user
		double width = Double.parseDouble(input); //Convert user input(if valid) to a double
		//Get user data for height
		System.out.println("Enter the height>");
		input = scanner.next();
		double height = Double.parseDouble(input);
		//Compute result using user data
		double area = height * (width / 2.0d);
		System.out.println("Area of Triangle: " + area);
	}
	
	//Returns the next token in the scanner
	private void processInput() {
		String option = scanner.next();
		int choice = Integer.parseInt(option); //Input validation
		
		if (choice == 1) {
			calcAreaCircle();
		} else if (choice == 2) {
			calcAreaTriangle();
		} else if (choice == 3) {
			System.exit(0);
		} else {
			System.out.println("Invalid selection.");
		}
	}
	
	private void init() {
		System.out.println(".......................................");
		System.out.println("\tSimple Area Calculator");
		System.out.println(".......................................");
		System.out.println("(1) Area of a Circle");
		System.out.println("(2) Area of a Triangle");
		System.out.println("(3) Quit");
		System.out.println("Select [1-3]>");
	}
	
	public static void main(String[] args) {
		new AreaCalculator();
	}
}
