package com.luo.HomeWork;
/**
 * 
 * @author Luo
 * @date 2020年5月6日
 *
 */
public class CarTest {
	public static void main(String[] args) {
		Car car = new Car("宝马", "SUV", 300000,456, 200, 0);
		run1(car);
		
	}
	public static void run1(Car car) {
		double kilomRe =(car.kilometer/100)*car.getFuel();
		int remainOil = (int) (car.fueltankvolume-kilomRe);
		System.out.println("剩余油量："+remainOil);
	}

}
