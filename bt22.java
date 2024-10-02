package HOCTAP;
public class bt22 {
	public static void main(String[] args) {
		    Author author = new Author("Lam","lambatdiet@gamil.com",'m');
	        Book book = new Book("JAVA", 150);
	        book.setQty(5);
	        System.out.println(book.toString());
	        System.out.println(author.toString());
	}
}
