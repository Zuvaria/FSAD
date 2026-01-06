package com.kl;
class Vehicle{
	void showType() {
		System.out.println("This is a Vehicle.");
	}
}
class Car extends Vehicle {
	void showBrand() {
		System.out.println("This is a Ca of a specific brand.");
	}
}
class ElectricCar extends Car{
	void showBatteryCapacity() {
		System.out.println("This Electric Car has a 75 kWh battery.");
	}
}
public class multilevelinheritace {
	public static void main(String[] args) {
		ElectricCar eCar = new ElectricCar();
		eCar.showType();
		eCar.showBrand();
		eCar.showBatteryCapacity();
	}

}
