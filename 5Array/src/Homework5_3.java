import java.util.Scanner;
/**
 * Create a temperature conversion utility
 * @author Dhruv
 *
 */
public class Homework5_3 {
public static void main(String[] args) {
	System.out.println("Type of conversion |Description              ");
	System.out.println("---------------------------------------------");
	System.out.println("FC 		   |Fahrenheit -> Celsius     ");
	System.out.println("CF		   |Celsius -> Fahrenheit    ");
	System.out.println("---------------------------------------------");
	String key = readUserStringInput("Enter type of conversion:");
	System.out.println("---------------------------------------------");
	int temp = readUserIntegerInput("Enter temperature: ");
	
	if (key.equals("FC")) {
	int F = (temp - 32)* 5/9;
	System.out.println("The temperature in celsius is " + F);
	
	}else if (key.equals("CF")) {
	int C = (temp * 9/5)+32;
	System.out.println("The temperature in fahrenheit is " + C);
	}
	else
		System.out.println("Invalid");
}


public static String readUserStringInput (String aInputMsg) {

	System.out.print( aInputMsg + " ");
	Scanner scanner = new Scanner(System.in);
	return scanner.next();
}
	public static int readUserIntegerInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

}

