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
	}
	
	public void calculateCircleArea () {
		
	}
	
	public void calculateTriangleArea () {
		
	}
	
	private void init() {
		System.out.println("...................................");
		System.out.println("\t\tSimple Area Calculator");
		System.out.println("...................................");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {
		
	}
}
