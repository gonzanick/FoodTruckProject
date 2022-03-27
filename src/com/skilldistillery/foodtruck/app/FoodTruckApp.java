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
				+ "Include the name of the food truck, the food type (int that order), and then a rating from 1-5 .\n"
				+ "Type in the word \"quit\" if you have entered in less than five (5) trucks.");

		int counter = 0;
		while (counter < 5) {
			String userInputName = sc.next();
			if (userInputName.equalsIgnoreCase("quit")) {
				System.out.println();
				break;
			}
			String userInputType = sc.next();
			int userInputRate = sc.nextInt();
			System.out.println();
			fTA.addTruckToArr(foodTrucks, userInputName, userInputType, userInputRate, counter);
			counter++;
	}			

		while (true) {
			System.out.println();
			System.out.println("Please select what you would like to do. ");
			System.out.println();
			fTA.menu();
			int userInput2 = sc.nextInt();

			if (userInput2 == 4) {
				System.out.println("You have exited the program.");
				break;
			}
			if (userInput2 == 1) {
				for (int i = 0; i < counter; i++) {
					System.out.println();
					System.out.println(foodTrucks[i]);
				}
			
			}
			if (userInput2 == 2) {
				System.out.println("The Average rating is " + fTA.averageRate(foodTrucks, counter));
				System.out.println();
				
			}
			if (userInput2 == 3) {
				System.out.println();
				System.out.println(fTA.highestRate(foodTrucks, counter));
				
			}
		}
	}

	public void menu() {
		System.out.println("1. List of Food Trucks");
		System.out.println("2. Average rating of Food Trucks");
		System.out.println("3. Highest rated Food Truck");
		System.out.println("4. Exit the program");

	}
	
	public void addTruckToArr(FoodTruck[] foodTrucks, String name, String type, int rate, int index) {
		foodTrucks[index] = new FoodTruck(name, type, rate);
	}
	
	public double averageRate(FoodTruck[] foodTrucks, int numFoodTrucks) {
		double sum = 0.0;
		for (int i = 0; i < numFoodTrucks; i++) {
			double temp = foodTrucks[i].getRating();
			sum += temp; 
		}
		
		return sum / numFoodTrucks;
	}
	
	public String highestRate(FoodTruck[] foodTrucks, int numOfTrucks) {
		int highestRate = 0;
		String winnerWinnerChickenDinner = " ";
		String type = " ";
		int iD = 0;
		for (int i = 0; i < numOfTrucks; i++) {
			if (highestRate < foodTrucks[i].getRating()) {
				highestRate = foodTrucks[i].getRating();
				winnerWinnerChickenDinner = foodTrucks[i].getName();
				type = foodTrucks[i].getFoodType();
				iD = foodTrucks[i].getTruckId();
			}
		}
		
		
		return "The highest rated food truck is: " + winnerWinnerChickenDinner + ", ID number: "  
		+ iD + ", " + type + ", " + highestRate ;
	}

}
