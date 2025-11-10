package parent;

//public class main{
	public class main  {
		public static void main(String[] args) {
			Book novel= new Novel("The Three-Body Problem","Liu Cixin");
			Book textbook= new Textbook("Thinking in java", "Bruce Eckel");
			Book magazine= new Magazine("National Geographic","Editorial Team");
			
			
			LibraryManager manager = new LibraryManager();
			manager.manageBorrow(novel); //single book
			manager.manageBorrow(textbook,20); //check borrowing days
			
			Book[] books = {novel, magazine};
			manager.manageBorrow(books, "Axelle ZOURE"); //Multiple books and borrower
			
		}
		
	
}

