package mainpkg;

public class ShoppingCart {

	public int pcount;
	public int totPrice;

	public void addBook(Book b) {
		// TODO Auto-generated method stub
		this.pcount += b.amount;
		this.totPrice += b.price*b.amount;
		
	}
	
	

}
