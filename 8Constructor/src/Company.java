/**
 * Homework8_7
 * @author Dhruv
 *
 */
public class Company {
public static void main(String[] args) {
	Employee dhruv = new Employee ();
	dhruv.setName("Dhruv Pisal ");
	dhruv.setAge(13);
	dhruv.setDesignation("CEO and founder of the company ");
	dhruv.setSalary(24000000);
	
	Employee avy = new Employee ();
	avy.setName("Avy Garothaya ");
	avy.setAge(15);
	avy.setDesignation("CFO");
	avy.setSalary(300000);
	
	Employee karthik = new Employee ();
	karthik.setName("Karthik Vinaykumar ");
	karthik.setAge(14);
	karthik.setDesignation("CIO ");
	karthik.setSalary(300000);
	
	Employee dhyeya = new Employee ();
	dhyeya.setName("Dhyeya Chandi ");
	dhyeya.setAge(14);
	dhyeya.setDesignation("COO ");
	dhyeya.setSalary(300000);
	
	Employee robert = new Employee ();
	robert.setName("Robert Stark ");
	robert.setAge(37);
	robert.setDesignation("Finance manager ");
	robert.setSalary(80000);
	
	Employee steve = new Employee ();
	steve.setName("Steve Mcbob ");
	steve.setAge(39);
	steve.setDesignation("Marketing mananger ");
	steve.setSalary(75000);
	
	Employee jeff = new Employee ();
	jeff.setName("Jeff Sparks ");
	jeff.setAge(43);
	jeff.setDesignation("Product manager ");
	jeff.setSalary(90000);
	
	Employee jimmy = new Employee ();
	jimmy.setName("Jimmy DonatesALot JR ");
	jimmy.setAge(36);
	jimmy.setDesignation("Project manager ");
	jimmy.setSalary(100000);
	
	Employee tom = new Employee ();
	tom.setName("Tom Porker ");
	tom.setAge(22);
	tom.setDesignation("Business analyst ");
	tom.setSalary(75000);
	
	Employee chris = new Employee ();
	chris.setName("Chris Lightning ");
	chris.setAge(33);
	chris.setDesignation("Marketing specialist ");
	chris.setSalary(85000);
	
	System.out.println(dhruv.getName() + "| " + dhruv.getAge() + "| "  + dhruv.getDesignation() + "| "  + dhruv.getSalary() + "| " );
}
}
