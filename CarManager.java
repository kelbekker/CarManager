package ua.com.foxminded.carmanager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) {
		
		Car prius = new PassengerCar("Toyota Prius", 2008, 1200, 15000, Color.GREEN);
		Car renualt = new Bus("Renualt Laguna", 2000, 9700, 1600, Color.WHITE);
		Car renualt1 = new Bus("Renualt Laguna", 2000, 9700, 1600, Color.WHITE);
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(prius);
		cars.add(renualt1);
		cars.add(renualt);
		
		System.out.println(cars);
		
		prius.addDistance(1000);
		prius.addDistance(2000);
		prius.addDistance(20.9);
		prius.addDistance(15000);
		renualt1.addDistance(15000);
		//prius.service();
		
		System.out.println(prius);
		System.out.println(renualt1);
		
		System.out.println("Toyota Prius is ready to service " + prius.isReadyToService());
		System.out.println(renualt1.isReadyToService());
		prius.service();
		
		
		
	}


}


