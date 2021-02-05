package com.sumit;

public class APP {
	public static void main(String[] args) {
		Car car = CarFactory.getCar("BMW");
		car.make();
		
		Car car2 = CarFactory.getCar("Mercedes");
		car2.make();
		
		Car car3 = CarFactory.getCar("Tesla");
		car3.make();
	}

}
