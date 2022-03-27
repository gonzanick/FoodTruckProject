package com.skilldistillery.foodtruck.entity;

public class FoodTruck {
	private static int nextTruckId = 1;
	private int truckID;
	
	private String name;
	private String foodType;
	private int rating;
	
	public FoodTruck() {  }
	
	public FoodTruck(String name, String foodType, int rating) {
		
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.truckID = getNextTruckId();
		nextTruckId++;
	}
	
	public int getTruckId() {
		return truckID;
	}

	public int getNextTruckId() {
		return nextTruckId;
	}

//	private void setNextTruckId(int nextTruckId) {
//		FoodTruck.nextTruckId = nextTruckId;
//	}

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
		return "FoodTruck name is " + name + " ID: " + truckID + ", food type is " + foodType + ", and their rating is " + rating;
	}
	
	
	

}
