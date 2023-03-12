package ua.com.foxminded.carmanager;

public class Bus extends Car {

	public Bus(String name, int yearOfProduction, int price, int weight, Color color) {
		super(name, yearOfProduction, price, weight, color);
		// TODO Auto-generated constructor stub
	}

	public void service() {
		if (distanceOnService >= 50000) {
		distanceOnService = 0;
		}
	}
	
	@Override
	public boolean isReadyToService() {
		if(distanceOnService > 50000) {
			return true;
		} else {
			return false;
		}
	}
	
}
