package LogicCourseChapter02;

import java.util.Scanner;

public class BeforeTaxes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type the product value: ");
		Double productValue = scanner.nextDouble();
		
		System.out.print("Type the costumer cash: ");
		Double costumerCash = scanner.nextDouble();
		
		Double result = costumerCash - productValue;
		
		System.out.println("Change before Tax: " + result);
		
		scanner.close();
		
	}
}
