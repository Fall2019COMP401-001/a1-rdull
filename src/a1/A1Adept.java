package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int storeItemCount = scan.nextInt();
		
		// creates two empty arrays
		String[] iNames = new String[storeItemCount];
		double[] iPrices = new double[storeItemCount];
		
		// sets up arrays to hold item names and item prices
		// with matching items and prices at same index
		for (int i = 0; i < storeItemCount; i++) {
			iNames[i] = scan.next();
			iPrices[i] = scan.nextDouble();
		}
		
		// initializes all necessary variables needed outside of loop
		int customerCount = scan.nextInt();
		double total = 0.0;
		double biggestNumber= 0;
		String biggestFirst = "";
		String biggestLast = "";
		double smallestNumber= 10000;
		String smallestFirst = "";
		String smallestLast = "";
		
		// for loop goes through every customer individually
		for (int i = 0; i < customerCount ; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int itemCount = scan.nextInt();
			double customerTotal = 0.0;
			
			// for loop goes through each item purchased by customer
			for (int j = 0; j < itemCount; j++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				double price = 0.0;
				
				// for loop goes through each item
				for (int k = 0; k < storeItemCount; k++) {
					
					// if statement finds price for item name given
					if (itemName.equals(iNames[k])) {
						price = iPrices[k];
						double cost = quantity * price;
						total += quantity * price;
						customerTotal += cost;
					}
				}
			}
			
			// creates new biggest number data if it is larger
			if (customerTotal > biggestNumber) {
				biggestNumber = customerTotal;
				biggestFirst = firstName;
				biggestLast = lastName;
			}
			
			// creates new smallest number data if it is smaller
			if (customerTotal < smallestNumber) {
				smallestNumber = customerTotal;
				smallestFirst = firstName;
				smallestLast = lastName;
			}
		}
		
		// divides total amount of money spent by number 
		// of customers to get the average spent
		double average = total / customerCount;
		System.out.println("Biggest: " + biggestFirst + " " + biggestLast + " (" 
				+ String.format("%.2f", biggestNumber) + ")");
		System.out.println("Smallest: " + smallestFirst + " " + smallestLast + " (" 
				+ String.format("%.2f", smallestNumber) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
	}
}