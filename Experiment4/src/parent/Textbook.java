package parent;


public class Textbook extends Book {

    public Textbook(String title, String author) {
        super(title, author);
    }

    @Override
    public String getBorrowInfo() {
        return String.format("《%s》(%s) - Textbook, borrowable for 15 days (including 1 renewal)", title, author);
    }

    public int calculateBorrowDays() {
        return 15;
    }


	
	}
	
