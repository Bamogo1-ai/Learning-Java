package parent;
//package librarysystem;

public class LibraryManager {

    // Manage a single book
    public void manageBorrow(Book book) {
        System.out.println(book.getBorrowInfo());
    }

    //  Manage an array of books and borrower's name
    public void manageBorrow(Book[] books, String borrowerName) {
        System.out.println("Borrower: " + borrowerName);
        int totalDays = 0;

        for (Book b : books) {
            System.out.println("- " + b.getBorrowInfo());
            totalDays += b.calculateBorrowDays1();
        }

        System.out.println("Total borrowable days (combined): " + totalDays + " days\n");
    }

    //  Manage a book with requested days
    public void manageBorrow(Book book, int days) {
        int maxDays = book.calculateBorrowDays1();
        if (days <= maxDays) {
            System.out.printf("Borrowable for %d days ✅ (Max: %d days)\n", days, maxDays);
        } else {
            System.out.printf("Exceeds maximum days ❌ (Max: %d days)\n", maxDays);
        }
    }

    //  main method to test
    public static void main(String[] args) {
        // Create some books
        Book novel = new Novel("Pride and Prejudice", "Jane Austen");
        Book textbook = new Textbook("Introduction to Java", "David Bamogo");
        Book magazine = new Magazine("National Geographic of Burkina Faso", "Various Authors");

        // Create library manager
        LibraryManager manager = new LibraryManager();

        System.out.println("=== Test 1: Single Book ===");
        manager.manageBorrow(novel);

        System.out.println("\n=== Test 2: Borrower with multiple books ===");
        Book[] books = {novel, textbook, magazine};
        manager.manageBorrow(books, "Axelle ZOURE");

        System.out.println("=== Test 3: Check borrow limit ===");
        manager.manageBorrow(textbook, 10); // valid
        manager.manageBorrow(magazine, 12); // exceeds
    }
}