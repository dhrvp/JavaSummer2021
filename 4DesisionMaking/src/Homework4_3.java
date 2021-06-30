
public class Homework4_3 {
	public static void main(String[] args) {
		int percent = ReadUserInput.readUserIntegerInput("Enter percentage : ");
	if ( percent >=90)
	System.out.println("The grade is A+. ");
	else if (percent<90 && percent>=80)
		System.out.println("The grade is A");
	else if ( percent >=70 && percent < 80)
		System.out.println("The grade is B+. ");
	else if (percent >= 60 && percent < 70)
		System.out.println("The grade is B. ");
	else if (percent >= 50 && percent < 60)
		System.out.println("The grade is C");
	else 
	System.out.println("You have failed! ");
		

	}
}
