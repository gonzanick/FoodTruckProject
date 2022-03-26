package com.skilldistillery.foodtruck.entity;

public class FoodTruck {
	private static int nextTruckId = 0;
	
	private String name;
	private String foodType;
	private int rating;
	
	public FoodTruck() {  }
	
	public FoodTruck(String name, String foodType, int rating) {
		setNextTruckId(nextTruckId);
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		nextTruckId++;
	}

	public static int getNextTruckId() {
		return nextTruckId;
	}

	private static void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FoodTruck name is " + name + ", food type is " + foodType + ", and their rating is " + rating + "]";
	}
	
	
	

}
