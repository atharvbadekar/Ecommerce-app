package EcommerceApplication;

import java.util.ArrayList;

public class Product{

	int id;
	private String productName;
	private double price;
	private String type;
	static ArrayList<Product> products = new ArrayList<>(); 
	
	static {
		// Adding Clothing Products
	    products.add(new Product(1,"Gag Wear Graphic Print Men & Women Multicolor Track Pants", 449, "Clothing"));
	    products.add(new Product(2,"Billion PerfectFit Solid Men Henley Multicolor T-Shirt (Pack of 3)", 1052, "Clothing"));
	    products.add(new Product(3,"V J Fashion Solid Fashion Art Silk Saree (Multicolor)", 445, "Clothing"));
	    products.add(new Product(4,"ADIDAS Men & Women Self Design Ankle Length (Pack of 6)", 189, "Clothing"));
	    products.add(new Product(5,"Billion PerfectFit Solid Men Round Neck Grey White T-Shirt (Pack of 3)", 1044, "Clothing"));

	    // Adding Footwear Products
	    products.add(new Product(6,"ADIDAS Men's & Women's Ankle Length Socks (Pack of 18)", 909, "Footwear"));
	    products.add(new Product(7,"ADIDAS Men & Women Ankle Length (Pack of 3)", 150, "Footwear"));
	    products.add(new Product(8,"Nike Men's Running Shoes", 2999, "Footwear"));

	    // Adding Electronics Products
	    products.add(new Product(9,"Samsung Galaxy M32 (Light Blue, 128GB)", 14999, "Electronics"));
	    products.add(new Product(10,"Apple iPhone 13 (Starlight, 128GB)", 69900, "Electronics"));
	    products.add(new Product(11,"OnePlus Nord CE 5G (Blue Void, 128GB)", 24999, "Electronics"));
	    products.add(new Product(12,"Sony WH-1000XM4 Wireless Noise Cancelling Headphones", 29990, "Electronics"));
	    products.add(new Product(13,"Mi Smart Band 6", 3499, "Electronics"));
	}
	public Product(int id,String productName, double price,String type) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.type = type;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Product Id : "+id+"\n Product Name: "+productName+"\n Price : "+price+" ]";
	}
	
	 


	
	

}
