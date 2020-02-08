class ReservedBook extends Book{
	private static boolean checkout = true;
	private static int checkoutdays = 0;

	public ReservedBook(String title, String author, int pages){
		super(title, author, pages); 
	}

	@Override
	public int getCheckOutDays(){
		return checkoutdays; 
	}
	@Override
	public boolean getCheckOut(){
		return checkout; 
	}
	@Override
	public void setCheckOut(Boolean b){
		checkout = b;
	}

}
