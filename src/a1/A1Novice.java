package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Takes entered value of number of customers
		int customerCount = scan.nextInt();
		// Uses scan to retrieve a first and last name and total number of groceries
		for (int i = 0; i < customerCount ; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int itemCount = scan.nextInt();
			double total = 0.0;
			// Establishes each individual item's total price by multiplying 
			// quantity by price
			for (int j = 0; j < itemCount; j++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
				total += quantity * price;
				
			}
			// Prints each customer's total cost with 2 decimal places
			System.out.println(firstName.charAt(0) + ". " + lastName + ": " 
			+ String.format("%.2f", total));
		}
		
		
		
		
		
		
		
		