package com.skilldistillery.foodtruck.entity;

public class FoodTruck {
	private static int nextTruckId;
	
	private String name;
	private String foodType;
	private int rating;
	
	public FoodTruck() {  }
	
	public FoodTruck(String name, String foodType, int rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		
	}

}
