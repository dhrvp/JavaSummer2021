import java.util.Scanner;

public class ReadUserInput {

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


	public static float readUserFloatInput(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
}
