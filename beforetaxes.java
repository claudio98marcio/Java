import java.util.Scanner;

public class BMIcalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to BMI calculator");
		System.out.println("Now we will give you the diagnostic if you be overweight or underweight");
		
		System.out.println("Insert your weight in kilograms (ex: 80): ");
		Double userWeight = scanner.nextDouble();
		
		System.out.println("Insert your height in meters (ex: 1.55): ");
		Double userHeight = scanner.nextDouble();
		
		Double resultMultiplying = userHeight * userHeight;
		
		Double resultBMI = userWeight / resultMultiplying;
		
		System.out.println("Your BMI is: " + resultBMI);
		
		scanner.close();
}
}
