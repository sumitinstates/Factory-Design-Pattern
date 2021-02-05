package com.sumit;

public class CarFactory {
	
	static Car getCar(String carType) {
		if(carType.equalsIgnoreCase("BMW")) {
			return new BMW();
		}else if(carType.equalsIgnoreCase("Mercedes")) {
			return new Mercedes();
		}else if(carType.equalsIgnoreCase("Tesla")) {
			return new Tesla();
		}
		return null;
	}

}
