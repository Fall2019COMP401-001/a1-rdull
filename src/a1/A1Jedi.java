package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int storeItemCount = scan.nextInt();
		
		// creates two empty arrays
		String[] iNames = new String[storeItemCount];
		double[] iPrices = new double[storeItemCount];
		int[] iCounts = new int[storeItemCount];
		int[] numberOfPurchasers = new int[storeItemCount];
		
		// sets up arrays to hold item names and item prices
		// with matching items and prices at same index
		for (int i = 0; i < storeItemCount; i++) {
			iNames[i] = scan.next();
			iPrices[i] = scan.nextDouble();
		}
		
		// initializes all necessary variables needed outside of loop
		int customerCount = scan.nextInt();
		
		// for loop goes through every customer individually
		for (int i = 0; i < customerCount ; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int itemCount = scan.nextInt();
	
			// for loop goes through each item purchased by customer
			for (int j = 0; j < itemCount; j++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				double price = 0.0;
						
				// for loop goes through each item
				for (int k = 0; k < storeItemCount; k++) {
							
					// if statement finds price for item name given
					if (itemName.equals(iNames[k])) {
						iCounts[k] += quantity;
						numberOfPurchasers[k] += 1; 
						
					}
				}
			}
		}
		
		for (int i = 0; i < storeItemCount; i++) {
			if (iCounts[i] == 0) {
				System.out.println("No customers bought " + iNames[i]);
			} else {
				System.out.println(numberOfPurchasers[i] + 
						" customers bought " + iCounts[i] +
						" " + iNames[i]);
			}
		}
	}
}
