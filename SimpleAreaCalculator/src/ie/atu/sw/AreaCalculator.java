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
		
	}
	
	public void calcAreaTriangle () {
		
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
