package ua.com.foxminded.carmanager;

import java.util.ArrayList;
import java.util.List;

public class MotorcycleManager {

	public static void main(String[] args) {
		
		Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16000, 600, " black", "diesel", true);
		Motorcycle yamaha = new Motorcycle("Yamaha FZ1", 2007, 9000, 700, "orangE", "gas", false); 
		
		List<Motorcycle> motorcycles = new ArrayList<>();
		
		motorcycles.add(yamaha);
		motorcycles.add(suzuki);
		
		System.out.println(motorcycles);
		
		suzuki.addDistance(250000);
		yamaha.addDistance(100000);
		yamaha.addDistance(150000);
		yamaha.addDistance(-11.5f);
		suzuki.addDistance(11.5f);
		
		suzuki.destroyEngine();
		yamaha.destroyEngine();
		
		suzuki.repair();
		yamaha.repair();
		
		yamaha.repaint();
		
		System.out.println(suzuki.isReadyToService());
		
		
		System.out.println(suzuki);
		System.out.println(yamaha);
		
		
		//System.out.println(suzuki.equals(yamaha));
	}

}
