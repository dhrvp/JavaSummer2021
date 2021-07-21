
public class Hw4_8BookApp {
	public static void main(String[] args) {
	
	Hw4_8Book b1 = new Hw4_8Book();
	b1.setTitle("Land of Stories The Wishing Spell ");
	b1.setNumberOfPages(544);
	b1.setAuthor("Chris Colfer ");
	b1.setYear(2014);
	b1.setCost(9.99);
	
	Hw4_8Book b2 = new Hw4_8Book();
	b2.setTitle("The Last Kids on Earth and the Midnight Blade ");
	b2.setNumberOfPages(304);
	b2.setAuthor("Max Brallier ");
	b2.setYear(2019);
	b2.setCost(14.00);
	
	Hw4_8Book b3 = new Hw4_8Book();
	b3.setTitle("Big Nate Goes Bananas");
	b3.setNumberOfPages(176);
	b3.setAuthor("Lincoln Peirce ");
	b3.setYear(2018);
	b3.setCost(9.99);
	
	Hw4_8Book b4 = new Hw4_8Book();
	b4.setTitle("Diary of a Wimpy Kid The Long Haul ");
	b4.setNumberOfPages(224);
	b4.setAuthor("Jeff Kinney ");
	b4.setYear(2014);
	b4.setCost(14.99);
	
	Hw4_8Book b5 = new Hw4_8Book();
	b5.setTitle("The One and Only Ivan ");
	b5.setNumberOfPages(336);
	b5.setAuthor("Katherine Applegate ");
	b5.setYear(2015);
	b5.setCost(8.99);
	
	System.out.println("Book Name and number of pages : " + b1.getTitle() + b1.getNumberOfPages() );
	System.out.println("Author name : " + b1.getAuthor());
	System.out.println("Publication year : " + b1.getYear());
	System.out.println("Book cost : " + b1.getCost());
	System.out.println("");
	System.out.println("Book Name and number of pages : " + b2.getTitle() + b2.getNumberOfPages() );
	System.out.println("Author name : " + b2.getAuthor() );
	System.out.println("Publication year : " + b2.getYear() );
	System.out.println("Book cost : " + b2.getCost() );
	System.out.println("");
	System.out.println("Book Name and number of pages : " + b3.getTitle() + b3.getNumberOfPages() );
	System.out.println("Author name : " + b3.getAuthor() );
	System.out.println("Publication year : " + b3.getYear() );
	System.out.println("Book cost : " + b3.getCost() );
	System.out.println("");
	System.out.println("Book Name and number of pages : " + b4.getTitle() + b4.getNumberOfPages() );
	System.out.println("Author name : " + b4.getAuthor());
	System.out.println("Publication year : " + b4.getYear());
	System.out.println("Book cost : " + b4.getCost());
	System.out.println("");
	System.out.println("Book Name and number of pages : " + b5.getTitle() + b5.getNumberOfPages() );
	System.out.println("Author name : " + b5.getAuthor());
	System.out.println("Publication year : " + b5.getYear());
	System.out.println("Book cost : " + b5.getCost());
	}
}
