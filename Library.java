import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
class Library{ 
	LocalDateTime datetime;
	ArrayList<Book> books = new ArrayList<Book>();
	boolean found = false;
	Scanner scanner = new Scanner(System.in); 
	public Library(ArrayList<Book> books){
		this.books = books; 
	}

	public void addBook(Book book){
		books.add(book);
	}

	public Book findTitle(String name){
		for(Book book:books){
			if(name.equals(book.getTitle())){
				System.out.println("We have that book");
				return book;
			}
		}
		System.out.println("We do not have that book");
		return null;
	}



		public LocalDateTime dueDate(Book b){
			datetime = null;
			LocalDateTime today = datetime.now();
			return today.plusDays(b.getCheckOutDays());
		}


		public void checkOut(){
			System.out.println("What book would you like to check out?");
			String checkOut = scanner.nextLine();
			Book book = this.findTitle(checkOut);
			if(book == null){
				System.out.println("We dont have that book");
				return;
			}

			boolean check = book.getCheckOut();

			if(check == false){
				System.out.println("the book is yours");
				book.setCheckOut(true);
			}
			else{
				System.out.println("That book has already been checked out");
			}
			
			
			
	}
}

