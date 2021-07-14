/**
 * print all prime numbers falls between 25 to 2000
 * @author Dhruv
 *
 */
public class Homework8_1 {
public static void main(String[] args) {
	for (int num=25; num <= 2000; num++) {
		isPrime(num);
	}	


}
// TODO Auto-generated method stub
private static void isPrime(int aNumber) {
	int integers =0;
	for (int num = 1; num <= aNumber; num++) {
	if (aNumber % num == 0);
			integers++;
	}


if (integers<=2);
System.out.println(aNumber);

			
		}
}



