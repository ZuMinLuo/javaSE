package com.luo.HomeWork;
/**
 * 
 * @author Luo
 * @date 2020年5月6日
 *
 */
public class Car {
	private String Brand;//品牌
	private String model;//车型
	private int price;//价格	
	double kilometer ;//里程数
	double fueltankvolume;//油箱容积
	private double remainingfuel;//剩余油量
	private double fuel;
	
   
	
	public String getBrand() {
		return Brand;
	}



	public void setBrand(String brand) {
		Brand = brand;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public double getKilometer() {
		return kilometer;
	}



	public void setKilometer(double kilometer) {
		this.kilometer = kilometer;
	}



	public double getFueltankvolume() {
		return fueltankvolume;
	}



	public void setFueltankvolume(double fueltankvolume) {
		this.fueltankvolume = fueltankvolume;
	}



	public double getRemainingfuel() {
		return remainingfuel;
	}



	public void setRemainingfuel(double remainingfuel) {
		this.remainingfuel = remainingfuel;
	}



	public double getFuel() {
		return fuel;
	}



	public void setFuel(double fuel) {
		this.fuel = fuel;
	}



	public Car(String brand, String model, int price, double fuel, double kilometer, double fueltankvolume) {
		Brand = brand;
		this.model = model;
		this.price = price;
		this.fuel = fuel;
		this.kilometer = kilometer;
		this.fueltankvolume = fueltankvolume;
		
	}
	
	
	
	
}
