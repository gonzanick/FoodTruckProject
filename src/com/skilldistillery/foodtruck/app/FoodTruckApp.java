package com.skilldistillery.foodtruck.app;

import java.util.Scanner;
import com.skilldistillery.foodtruck.entity.*;

public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruckApp fTA = new FoodTruckApp();
		Scanner sc = new Scanner(System.in);
		FoodTruck foodTrucks[] = new FoodTruck[5];
		String userInput;

		System.out.println("Please enter up to five (5) different food trucks.\n"
				+ "Include the name of the food truck, the food type, and a rating .\n"
				+ "Type in the word \"quit\" if you have entered in less than five (5) trucks.");

		for (int i = 0; i < 5; i++) {
			userInput = sc.next();
			if (userInput.equalsIgnoreCase("quit")) {
				break;
			}

		}
//		while (true) {
//			fTA.menu();
//			System.out.println("Please select what you would like to do. ");
//			int userInput2 = sc.nextInt();
//
//			if (userInput2 == 4) {
//				break;
//			}
//		}
	}

	public void menu() {
		System.out.println("1. List of Food Trucks");
		System.out.println("2. Average rating of Food Trucks");
		System.out.println("3. Highest rated Food Truck");
		System.out.println("4. Exit the program");

	}
	
	public void addTruckToArr(FoodTruck[] foodTrucks, String name, String type, int rate) {
		foodTrucks[0] = new FoodTruck();
		
	}

}
