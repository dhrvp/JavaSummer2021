
/**
 * @author Dhruv
 * This demonstrates the min and max value of primitive data types
 */
public class Homework3_3 {
	public static void main(String[] args) {
		byte minByte = -128;
		byte maxByte = 127;
		short minShort = -32768;
		short maxShort = 32767;
		int minInt = -2147483648;
		int maxInt = 2147483647;
		long minLong = -9223372036854775808l;
		long maxLong = 9223372036854775807l;
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		double minDouble = Double.MAX_VALUE;
		double maxDouble = Double.MIN_VALUE;
		boolean minBoolean = Boolean.FALSE;
		boolean maxBoolean = Boolean.TRUE;
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		
System.out.println("Byte min value is" + minByte + " and max value is " + + maxByte );
System.out.println("Short min value is" + minShort + " and max value is " + maxShort);
System.out.println("Int min value is" + minInt + " and max value is " + maxInt);
System.out.println("Long min value is" + minLong + " and max value is " + maxLong);
System.out.println("Float min value is" + minFloat + " and max value is " + maxFloat);
System.out.println("Double min value is" + minDouble + " and max value is " + maxDouble);
System.out.println("Boolean min value is" + minBoolean + " and max value is " + maxBoolean);
System.out.println("Char min value is" + minChar + " and max value is " + maxChar);

	}
}