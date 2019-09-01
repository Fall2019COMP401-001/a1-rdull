package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int customerCount = scan.nextInt();
		for (int i = 0; i < customerCount ; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int itemCount = scan.nextInt();
			double total = 0.0;
			for (int j = 0; j < itemCount; j++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
				total += quantity * price;
			}
			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + total);
		}
		
		
		
		
		
		
		
		// All of this original code did not work but may work for other problems 
		// (ie jedi)
		// Class for items
		/* public class Item {
			String itemName; 
			int quantity;
			double price;	
			
			Item() {
				this.itemName = scan.next();
				this.quantity = scan.nextInt();
				this.price = scan.nextDouble();
			}
		}
		
		// Class for customers
		class Customer {
			String firstName;
			String lastName;
			int count;
			Item[] items = [];
			
			Customer() {
				this.firstName = scan.next();
				this.lastName = scan.next();
				this.count = scan.nextInt();
			}
			
			void createList() {
				this.items = Items[count];
				for (i = 0, i < count, i++) {
					 Item[0] = new Item();
				}
			}
		}
		
		// receive customer count
		int customerCount = scan.nextInt();
		
		// creates correct number of customers and those customers
		for (int i = 0; i < customerCount; i++) {
			Customer j = new Customer();
			j.createList();
			double total = 0.0;
			int countItems = j.items.count();
			// calculates total price for the customer
			for (x = 0; x < countItems; x++) {
				total += j.items[x].quantity * j.items[x].price;
			}
			System.out.println(j.firstName[0] + ". " + j.lastName + ": "+ total);	 
		} */
	}
} 
