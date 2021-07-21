/**
 * Homework4_8
 * @author Dhruv
 *
 */
public class Hw4_8Book {
	private String Title;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getNumberOfPages() {
		return NumberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		NumberOfPages = numberOfPages;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public double getCost() {
		return Cost;
	}
	public void setCost(double cost) {
		Cost = cost;
	}
	private int NumberOfPages;
	private String Author;
	private int Year;
	private double Cost;

}
