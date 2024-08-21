package EcommerceApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Homepage{
	ArrayList<Product> cart  = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	static {
		System.out.println("--------Welcome to the Homepage-----------");
		System.out.println();
	}
	
	public void homepage() {
		while(true) {
			System.out.println("Shop by categories ");
			System.out.println("1.cloths \n2.Footwear \n3.Electronics \n4.Checkout \n5.Logout\n");
			System.out.print("Enter your choice : ");
			int option = sc.nextInt();
			switch(option) {
				case 1:{
					for(Product product : Product.products ){
						if(product.getType().equalsIgnoreCase("Clothing")) {
							System.out.println(product);
						}
					}
					addToCart();
					break;
				}
				case 2:{
					for(Product product : Product.products ){
						if(product.getType().equalsIgnoreCase("Footwear")) {
							System.out.println(product);
						}
					}
					addToCart();
					break;
				}
				case 3:{
					for(Product product : Product.products ){
						if(product.getType().equalsIgnoreCase("Electronics")) {
							System.out.println(product);
						}
					}
					addToCart();
					break;
				}
				case 4:{
					checkout();
					break;
				}
				case 5:{
					System.exit(0);
				}
				default:{
					System.out.println("Incorret input ");
				}
				
				
			}
		}
	}
	
	public void addToCart() {
		boolean shoping = true;
		while(shoping) {
			System.out.print("Enter product id to add to cart : ");
			int id = sc.nextInt();
			if(id<14) {
				addProduct(id);
			}
			else {
				System.out.println("Add valid ID ");
			}
			System.out.println("\nWant to shope more ? \n");
			System.out.println("1. yes \n2. No");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				{
					homepage();
					break;
				}
			case 2:
				{
					shoping=false;
					checkout();
					break;
				}
			default:
				{
					checkout();
				}
			}
			
		}
	}
	
	public void addProduct(int id) {
		for(Product product : Product.products ){
			if(product.id==id) {
				cart.add(product);
			}
		}
	}
	
	public void logout() {
		System.out.println("Successfully loged out");
		
	}
	
	public void checkout() {
		if(cart==null) {
			System.out.println("\nThere is no product in the cart add the products.\n");
			homepage();
		}
		else {
			System.out.println("--------------Products in your cart is ----------\n");
			System.err.println();
			double totalAmount = 0; 
			for(Product p : cart ){
				System.out.println(p);
				totalAmount += p.getPrice();
			}
			System.out.println("\nTotal amount to pay : "+ totalAmount+"\n");
			System.out.println("----------------Plese visit again--------------------------");
			return;
		}
		
	}
}
