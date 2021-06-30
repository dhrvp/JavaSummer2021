import java.util.Scanner;

public class Homework4_2{
public static void main(String[] args) {
	
int loan = ReadUserInput.readUserIntegerInput("Enter loan ammount: ");
int intrate = ReadUserInput.readUserIntegerInput("Enter monthly intrest rate ammount: ");
int loanpd = ReadUserInput.readUserIntegerInput("Enter loan period ammount in months : ");
	
int emi = (loan*intrate)* ((1+intrate)^loanpd / ((1+intrate)^loanpd)-1);

int rate = intrate / (12*100);
double Emi= (loan*rate*Math.pow(1+rate,loanpd))/(Math.pow(1+rate,loanpd)-1);

System.out.println("Monthly EMI for the loan ammount " + emi);
	
	
}


public static int readUserIntegerInput (String aInputMsg) {
	System.out.print( aInputMsg + " ");
	Scanner scanner = new Scanner(System.in);
	return scanner.nextInt();
}
}

