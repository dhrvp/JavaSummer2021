/**
 * Homework8_6
 * @author Dhruv
 *
 */
public class Pet {
	private String breed;
	private int age;
	private String color;
	private String petype;
	private boolean barks;
	private String petname;
	
	public String getPetname() {
		return petname;
	}
	public void setPetname(String petname) {
		this.petname = petname;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPetype() {
		return petype;
	}
	public void setPetype(String petype) {
		this.petype = petype;
	}
	public void barks() {
		if (breed.equalsIgnoreCase("Dog")) {
		barks = true;
	}else {
		barks = false;	
		}
	
	}
}
