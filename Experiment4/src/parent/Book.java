package parent;

public class Book {

	protected String title;
	protected String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
	}
	public String getBorrowInfo() {
		return "Unknown book lending information";
		
	}
	public int calculateBorrowDays1() {
		return 14; //Default borrowable days :14
}
}
