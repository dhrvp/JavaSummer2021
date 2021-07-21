/**
 * Create a class by name Lamp
 * @author Dhruv
 *
 */
public class Lamp {
private boolean power;
	
public void switchOn() {
	power = true; }
	
public void switchOff() {
	power = false; }

public void isLampOn() {
	if (power == true)
		System.out.println("The lamp is On");
	else
		System.out.println("The lamp is Off");

}
}

