/**
 * Homework8_3
 * @author Dhruv
 *
 */
public class Hw8_3PlanetApp {
public static void main(String[] args) {
		
	Hw8_3Planet mercury = new Hw8_3Planet();
	mercury.setOrbitalPeriod("88 days ");
	mercury.setDistanceFromSun("29.3 million miles ");
	mercury.setSurfaceArea("28.88 million miles² ");
	mercury.setLengthOfDay("58 days 15 hours 30 minutes ");
	mercury.setRadius("1,516 miles ");
	mercury.setHasRings("No ");
	
	Hw8_3Planet venus = new Hw8_3Planet();
	venus.setOrbitalPeriod("225 days ");
	venus.setDistanceFromSun("67.009 million miles ");
	venus.setSurfaceArea("177.7 million miles² ");
	venus.setLengthOfDay("116 days 18 hours 0 minutes ");
	venus.setRadius("3,760.4 miles ");
	venus.setHasRings("No ");
	
	Hw8_3Planet earth = new Hw8_3Planet();
	earth.setOrbitalPeriod("365 days ");
	earth.setDistanceFromSun("94.461 million miles ");
	earth.setSurfaceArea("196.9 million miles² ");
	earth.setLengthOfDay("24 hours ");
	earth.setRadius("3,958.8 miles ");
	earth.setHasRings("No ");
	
	Hw8_3Planet mars = new Hw8_3Planet();
	mars.setOrbitalPeriod("687 days ");
	mars.setDistanceFromSun("155.76 million miles ");
	mars.setSurfaceArea("55.91 million miles² ");
	mars.setLengthOfDay("1 days 0 hours 37 minutes ");
	mars.setRadius("2,106.1 miles ");
	mars.setHasRings("No ");
	
	Hw8_3Planet jupiter = new Hw8_3Planet();
	jupiter.setOrbitalPeriod("12 years ");
	jupiter.setDistanceFromSun("468.15 million miles ");
	jupiter.setSurfaceArea("23.71 billion miles² ");
	jupiter.setLengthOfDay("9 hours 56 minutes ");
	jupiter.setRadius("43,441 miles ");
	jupiter.setHasRings("Yes ");
	
	Hw8_3Planet saturn = new Hw8_3Planet();
	saturn.setOrbitalPeriod("29 years ");
	saturn.setDistanceFromSun("923.53 million miles ");
	saturn.setSurfaceArea("16.49 billion miles² ");
	saturn.setLengthOfDay("10 hours 42 minutes ");
	saturn.setRadius("36,184 miles ");
	saturn.setHasRings("Yes ");
	
	Hw8_3Planet uranus = new Hw8_3Planet();
	uranus.setOrbitalPeriod("84 years ");
	uranus.setDistanceFromSun("1.8351 billion miles ");
	uranus.setSurfaceArea("3.121 billion miles² ");
	uranus.setLengthOfDay("17 hours 14 minutes ");
	uranus.setRadius("15,759 miles ");
	uranus.setHasRings("Yes ");
	
	Hw8_3Planet neptune = new Hw8_3Planet();
	neptune.setOrbitalPeriod("165 years ");
	neptune.setDistanceFromSun("2.7808 billion miles ");
	neptune.setSurfaceArea("2.941 billion miles² ");
	neptune.setLengthOfDay("16 hours 6 minutes ");
	neptune.setRadius("15,299 miles ");
	neptune.setHasRings("Yes ");

	System.out.println("---------------------------------------------------------------------------------------------------------");
	System.out.println("Name	|Orbital Period   |Distance From Sun    |Surface Area         |Length Of Day               |Radius        |Has Rings   |");
	System.out.println("---------------------------------------------------------------------------------------------------------");
	System.out.println("Mercury |" + mercury.getOrbitalPeriod() + ("         |") + mercury.getDistanceFromSun() + "  |" + mercury.getSurfaceArea() + "|" + mercury.getLengthOfDay() +"|" + mercury.getRadius() + "  | "  + mercury.getHasRings() + "        |");
	System.out.println("Venus   |" + venus.getOrbitalPeriod() + ("        |") + venus.getDistanceFromSun() + "|" + venus.getSurfaceArea() + "|" + venus.getLengthOfDay() +"|" + venus.getRadius()  + "| " + venus.getHasRings() + "        |");
	System.out.println("Earth   |" + earth.getOrbitalPeriod() + ("        |") + earth.getDistanceFromSun() + "|" + earth.getSurfaceArea() + "|" + earth.getLengthOfDay() +"                   |" + earth.getRadius()  + "| " + earth.getHasRings() + "        |");
	System.out.println("Mars    |" + mars.getOrbitalPeriod() + ("        |") + mars.getDistanceFromSun() + "|" + mars.getSurfaceArea() + "|" + mars.getLengthOfDay() +"  |" + mars.getRadius()  + "| " + mars.getHasRings() + "        |");
	System.out.println("Jupiter |" + jupiter.getOrbitalPeriod() + ("        |") + jupiter.getDistanceFromSun() + "|" + jupiter.getSurfaceArea() + "|" + jupiter.getLengthOfDay() +"         |" + jupiter.getRadius()  + " | " + jupiter.getHasRings() + "       |");
	System.out.println("Saturn  |" + saturn.getOrbitalPeriod() + ("        |") + saturn.getDistanceFromSun() + "|" + saturn.getSurfaceArea() + "|" + saturn.getLengthOfDay() +"        |" + saturn.getRadius()  + " | " + saturn.getHasRings() + "       |");
	System.out.println("Uranus  |" + uranus.getOrbitalPeriod() + ("        |") + uranus.getDistanceFromSun() + "|" + uranus.getSurfaceArea() + "|" + uranus.getLengthOfDay() +"        |" + uranus.getRadius()  + " | " + uranus.getHasRings() + "       |");
	System.out.println("Neptune |" + neptune.getOrbitalPeriod() + ("       |") + neptune.getDistanceFromSun() + "|" + neptune.getSurfaceArea() + "|" + neptune.getLengthOfDay() +"         |" + neptune.getRadius()  + " | " + neptune.getHasRings() + "       |");
	
} 
}
