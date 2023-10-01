package com.project1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FinalProject_Fahim {
	  public static void main(String[] args) {
		  
// Hello Professor, I am Md Tanzimul Alam Fahim. Banner: 840231155
// For this final project, I have decided to work on a Store inventory Management System
// I will try my best to cover everything from the syllabus.
// And I'll also try to be creative.	 Like adding colors and making font bold.	  
// Thank you for everything and thank you for teaching us.
		  	
		  	Scanner inScanner = new Scanner(System.in);
		  	Random inRandom = new Random();
		  	int upperBound = 1024;
		  	int intRandom = inRandom.nextInt(upperBound);
		  	
		  	String ANSI_RESET = "\u001B[0m";
		  	String ANSI_YELLOW = "\033[1;33m";
		  	String ANSI_YELLOW_BOLD = "\033[1;33m";
		  	String ANSI_WHITE_BOLD = "\033[1;37m";
		  	String ANSI_RED_BOLD = "\033[1;31m";
		  	String ANSI_GREEN_BOLD = "\033[1;32m";
		  	String ANSI_BLUE_BOLD = "\033[1;34m";
		  	String ANSI_CYAN_BOLD = "\033[1;36m";
		  	String[] inventoryStrings = {"Watermelon", "Mango", "Banana"};
		  	int[] itemQuantity = {30, 50, 95};
		  	double[] itemPrices = {1.00, 0.50, 0.65};
		  	
		  	while(true) {
		  		System.out.println(ANSI_GREEN_BOLD + "Login successful! UserID:" + intRandom + ANSI_RESET);
		  		int userID = intRandom;
		  		System.out.println(ANSI_WHITE_BOLD + "Hello. Welcome to the Inventory Management System! @developed by Fahim.");
		  		System.out.println("Press 1 to: View Inventory");
		  		System.out.println("Press 2 to: Add items to Inventory");
		  		System.out.println("Press 3 to: Sell items from Inventory");
		  		System.out.println("Press 4 to: Signout from the Inventory Management System");
		  		
		  		System.out.println("Press a number to begin. Pleasure to help :)");
		  		int pressNumber = inScanner.nextInt();
		  		
		  		switch (pressNumber) {
		  		case 1: 
		  			System.out.println("Inventory: ");
		  			for (int i = 0; i < inventoryStrings.length; i++) {
		  				System.out.println(inventoryStrings[i] + " x " + itemQuantity[i]+ " Price: $" +itemPrices[i]);
		  			}
		  			break;
		  		case 2:
		  			System.out.println("Add new item(s) to Inventory. Enter item name: ");
		  			String newproductString = inScanner.next();
		  			System.out.println("Enter the quantity of the item: ");
		  			int newitemQuantity = inScanner.nextInt();
		  			System.out.println("Enter price per product of the new item: ");
		  			double newPrice = inScanner.nextDouble();
		  			
		  			boolean foundItem = false;
		  			for (int i = 0; i < inventoryStrings.length; i++) {
		  				if (newproductString.equals(inventoryStrings[i])) {
		  					itemQuantity[i] += newitemQuantity;
		  					itemPrices[i] = newPrice;
		  					foundItem = true;
		  					System.out.println(ANSI_GREEN_BOLD + "New item has been added to the Inventory Management System successfully!" + ANSI_RESET);
		  					break;
		  					
		  				}
		  			}
		  			
		  			if (!foundItem) {
		  				inventoryStrings = Arrays.copyOf(inventoryStrings, inventoryStrings.length + 1);
		  				itemQuantity = Arrays.copyOf(itemQuantity, itemQuantity.length + 1);
		  				itemPrices = Arrays.copyOf(itemPrices, itemPrices.length + 1);
		  				inventoryStrings[inventoryStrings.length -1] = newproductString;
		  				itemQuantity[itemQuantity.length -1] = newitemQuantity;
		  				itemPrices[itemPrices.length - 1] = newPrice;
		  				System.out.println(ANSI_GREEN_BOLD + "New item added to inventory!" + ANSI_RESET);
		  			}
		  				break;
		  		case 3:
		  			System.out.println("Enter the item name: ");
		  			String sellitemString = inScanner.next();
		  			System.out.print("Enter the quantity of the item to sale: ");
		  			int sellitemQuantity = inScanner.nextInt();
		  			
		  			boolean foundSellitem = false;
		  			for (int i = 0; i < inventoryStrings.length; i++){
		    			if (inventoryStrings[i].equals(sellitemString)) {
		    				if (itemQuantity[i]>= sellitemQuantity) {
		    					itemQuantity[i]-= sellitemQuantity;
		    					foundSellitem = true;
		    					System.out.println(ANSI_GREEN_BOLD + "Sale of the item has been completed!" +ANSI_RESET);
		    					break;
		    				} else {
		    					System.out.println(ANSI_YELLOW + "Insufficient stock for the item." + ANSI_RESET);
		    					break;
		    				}
		    			}
		        }
		  	    if (!foundSellitem) {
		  	    	System.out.println("Item not found!");
		  	    }
		  	    break;
		  	    case 4:
		  	    	System.out.println(ANSI_BLUE_BOLD + "UserID:" + userID + " logout successful!" + ANSI_RESET);
		  	    	System.out.println(ANSI_YELLOW_BOLD + "Thank you for using our Inventory Management System!");
		  	    	System.out.println("Have a wonderful day!"+ ANSI_RESET + ANSI_CYAN_BOLD + "@Developed by Fahim" + ANSI_RESET);
		  	    	System.exit(0);
		  	    default:
		  	    	System.out.println(ANSI_RED_BOLD + "Invalid option entered. Try again!" + ANSI_RESET);
		  	    	break;
		  	    	
		  		}
		  		Arrays.sort(inventoryStrings);
		  		System.out.println("Press Enter key to continue...");
		        Scanner inNewScanner = new Scanner(System.in);
		        inNewScanner.nextLine();
		 
		  	}
	  }
}
