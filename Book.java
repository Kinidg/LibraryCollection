class Book{
	private String title;
	private String author;
	private int pages; 
	private boolean checkout; 

	public Book(String title, String author, int pages){
		this.title = title;
		this.author = author;
		this.pages = pages; 
	}
	@Override    
	public String toString(){
		return title + " by " + author;
	}

	public String getTitle(){
		return title; 
	}
}