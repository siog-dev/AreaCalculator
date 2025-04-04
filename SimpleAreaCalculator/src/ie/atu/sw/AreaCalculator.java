package ie.atu.sw;

import java.util.Scanner;

public class AreaCalculator {

	//Instance variables
	private Scanner scanner;
	private boolean keepRunning = true;
	
	public AreaCalculator() {
		scanner = new Scanner(System.in);
		
		while (keepRunning) { //Could use (keepRunning == true) but there is more room for error
			init();
			processInput();
		}
		
	}
	
	public void calcAreaCircle () {
		System.out.println("Enter the radius>");
		String input = scanner.next();
		double radius = Double.parseDouble(input);
		double area = Math.PI * (radius * radius);
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
	
	private void processInput() {
		String option = scanner.next();
		int choice = Integer.parseInt(option);
		
		switch(choice) {
			case 1  -> calcAreaCircle(); //One method invocation per line
			case 2  -> calcAreaTriangle();
			case 3  -> keepRunning = false;
			default -> System.out.println("Invalid selection.");
		}
		
		/*
		//Old Switch Statement
		switch(choice) {
			case 1:
				calcAreaCircle();
				break;
			case 2:
				calcAreaTriangle();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid selection.");
				break;
		}
		//IF Statement
		if (choice == 1) {
			calcAreaCircle();
		} else if (choice == 2) {
			calcAreaTriangle();
		} else if (choice == 3) {
			System.exit(0);
		} else {
			System.out.println("Invalid selection.");
		}*/
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
