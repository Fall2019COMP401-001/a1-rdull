package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int storeItemCount = scan.nextInt();
		String[] iNames = new String[storeItemCount];
		double[] iPrices = new double[storeItemCount];
		
		for (int i = 0; i < storeItemCount; i++) {
			iNames[i] = scan.next();
			iPrices[i] = scan.nextDouble();
		}
		
		int customerCount = scan.nextInt();
		double total = 0.0;
		double biggestNumber= 0;
		String biggestFirst = "";
		String biggestLast = "";
		double smallestNumber= 10000;
		String smallestFirst = "";
		String smallestLast = "";
		
		for (int i = 0; i < customerCount ; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int itemCount = scan.nextInt();
			double customerTotal = 0.0;
			
			for (int j = 0; j < itemCount; j++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				double price = 0.0;
				
				for (int k = 0; k < storeItemCount; k++) {
					
					if (itemName.equals(iNames[k])) {
						price = iPrices[k];
						double cost = quantity * price;
						total += quantity * price;
						customerTotal += cost;
					}
				}
			}
			
			if (customerTotal > biggestNumber) {
				biggestNumber = customerTotal;
				biggestFirst = firstName;
				biggestLast = lastName;
			}
			
			if (customerTotal < smallestNumber) {
				smallestNumber = customerTotal;
				smallestFirst = firstName;
				smallestLast = lastName;
			}
		}
		
		double average = total / customerCount;
		System.out.println("Biggest: " + biggestFirst + " " + biggestLast + " (" 
				+ String.format("%.2f", biggestNumber) + ")");
		System.out.println("Smallest: " + smallestFirst + " " + smallestLast + " (" 
				+ String.format("%.2f", smallestNumber) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
	}
}