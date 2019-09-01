package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Class for items
		class Item {
			String itemName = scan.next();
			int quantity = scan.nextInt();
			double price = scan.nextDouble();			
		}
		
		// Class for customers
		class Customer {
			String firstName = scan.next();
			String lastName = scan.next();
			int count = scan.nextInt();
			Item[] items = new Item[count];
			
			for (i = 0, i < count, i++) {
				Item[0] = new Item();
			}
		}
		
		// receive customer count
		int customerCount = scan.nextInt();
		
		// creates correct number of customers and those customers
		for (i = 0; i < customerCount; i++) {
			Customer j = new Customer();
			double total = 0.0;
			int countItems = j.items.count();
			// calculates total price for the customer
			for (x = 0; x < countItems; x++) {
				total += j.items[x].quantity * j.items[x].price;
			}
			System.out.println(j.firstName[0] + ". " + j.lastName + ": "+ total);	 
		}
	}
} 
