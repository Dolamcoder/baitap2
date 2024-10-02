package HOCTAP;
public class Book {
	    private String name;
	    private double price;
	    private int qty = 0;
	    Author[] author=new Author[2];
	    public Book(String name, double price)
	    {
	    	this.name=name;
	    	this.price=price;
	    }
	    Author[] getAuthor()
	    {
	    	return this.author;
	    }
	    double getPrice()
	    {
	    	return this.price;
	    }
	    void setQty(int x)
	    {
	    	this.qty=x;
	    }
	    int getQty()
	    {
	    	return this.qty;
	    }
	    public String toString() {
	        return "Name: " + this.name + ", Price: " + this.price + ", Quantity: " + this.qty;
	    }
}
