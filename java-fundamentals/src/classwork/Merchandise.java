package classwork;

public class Merchandise {
	private double price;
	private String name;
	private int quantity;

	 
	public  Merchandise(double price, String name, int quantity) 

	{

	    this.price = price;

	    this.name = name;

	    this.quantity = quantity;

	  }

	  public double getPrice () {

	    return price;

	  }

	  public double getQuantity () {

	    return quantity;

	  }

	  public String toString () {

	    return String.format( "%s, $%5.2f", name, price);

	  }

	}  
