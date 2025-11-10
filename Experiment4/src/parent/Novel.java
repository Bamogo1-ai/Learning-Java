package parent;

public class Novel extends Book {

    public Novel(String title, String author) {
        super(title, author);
    }

    @Override
    public String getBorrowInfo() {
        return String.format("《%s》(%s) - Novel, borrowable for 30 days", title, author);
    }

    
    public int calculateBorrowDays() {
        return 30;
    }
}