import java.util.Scanner;

public class Homework4_6 {

public static void main(String[] args) {
String aMonthName = ReadUserInput.readUserStringInput("Enter month name: ");


switch(aMonthName) {
case "January":
	System.out.println("This is the first month. ");
	break;
	case "Febuary":
	System.out.println("This is the 2nd month. ");
	break;
case "March":
	System.out.println("This is the 3rd month. ");
	break;
case "April":
	System.out.println("This is the 4th month. ");
	break;
case "May":
	System.out.println("This is the 5th month. ");
	break;
case "June":
	System.out.println("This is the 6th month. ");
	break;
case "July":
	System.out.println("This is the 7th month. ");
	break;
case "August":
	System.out.println("This is the 8th month. ");
	break;
case "September":
	System.out.println("This is the 9th month. ");
	break;
case "October":
	System.out.println("This is the 10th month. ");
	break;
case "November":
	System.out.println("This is the 11th month. ");
	break;
case "December":
	System.out.println("This is the 12th month. ");
	break;  

	
default:
	System.out.println("Not a month! ");
 }
}

	public static String readUserStringInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}

}



