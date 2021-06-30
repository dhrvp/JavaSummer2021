import java.util.Scanner;

public class Homework4_1 {
	// Take integer input from user and print if number is greater than 100
	public static void main(String[] args) {
		int num = ReadUserInput.readUserIntegerInput("Enter a number: ");

		if (num > 100) {
			System.out.println(num + " is greater than 100.");
		} else {
			System.out.println(num + " is less than 100.");

		}
		System.out.println("--------------------------");

//Take integer input from user and print if number is even of odd
		int eonum = ReadUserInput.readUserIntegerInput("Enter a number: ");
		if (eonum % 2 == 0) {
			System.out.println(eonum + "is a even number.");
		} else {
			System.out.println(eonum + " is a odd number.");

		}
		System.out.println("--------------------------");
//Take 4 integer input from user and print maximum number
		int onenum = ReadUserInput.readUserIntegerInput("Enter 1st number: ");
		int twonum = ReadUserInput.readUserIntegerInput("Enter 2nd number: ");
		int threenum = ReadUserInput.readUserIntegerInput("Enter 3rd number: ");
		int fournum = ReadUserInput.readUserIntegerInput("Enter 4th number: ");
		if (onenum > twonum && onenum > threenum && onenum > fournum)
			System.out.println(onenum + " is the maximum number. ");
		else if (twonum > onenum && twonum > threenum && twonum > fournum)
			System.out.println(twonum + " is the maximum number. ");
		else if (threenum > onenum && threenum > twonum && threenum > fournum)
			System.out.println(threenum + " is the maximum number. ");
		else
			System.out.println(fournum + " is the maximum number. ");
		System.out.println("--------------------------");
//Take 4 integer input from user and print minimum number
		int numone = ReadUserInput.readUserIntegerInput("Enter 1st number: ");
		int numtwo = ReadUserInput.readUserIntegerInput("Enter 2nd number: ");
		int numthree = ReadUserInput.readUserIntegerInput("Enter 3rd number: ");
		int numfour = ReadUserInput.readUserIntegerInput("Enter 1st number: ");
		if (numone < numtwo && numone < numthree && numone < numfour)
			System.out.println(numone + " is the minimum number. ");
		else if (numtwo < numone && numtwo < numthree && numtwo < numfour)
			System.out.println(numtwo + " is the minimum number. ");
		else if (numthree < numone && numthree < numtwo && numthree < numfour)
			System.out.println(numthree + " is the minimum number. ");
		else
			System.out.println(numfour + " is the minimum number. ");
		
		System.out.println("--------------------------");
		

	}

}
