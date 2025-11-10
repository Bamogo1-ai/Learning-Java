package parent;

//public class Magazine {
	
	//Subclass: Magazine
	public class Magazine extends Book {

		public Magazine(String title, String author) {
			super(title, author);
			
		}
		@Override
		public String getBorrowInfo() {
			return String.format("<<%s>> (%s) - Magazine, borrowable for %d days", title, author,calculateBorrowDays());

		}
		public int calculateBorrowDays() {
			return 7;

}
}