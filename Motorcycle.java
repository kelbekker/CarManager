package ua.com.foxminded.carmanager;

import java.util.Objects;

public class Motorcycle {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	String color;
	String engineType;
	boolean isReadyToDrive;
	private int distance = 0;
	protected int distanceOnService = 0;
	
	public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType,
			boolean isReadyToDrive) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color.replace(" ", "").replaceFirst("b", "B").replace("o", "O").replace("E", "e");
		this.engineType = engineType;
		this.isReadyToDrive = isReadyToDrive;
	}

	public void addDistance(int additinalDistance) {
		distance += additinalDistance;
		addDistanceOnService(additinalDistance);
	}
	
	public void addDistance(double additinalDistance) {
		distance += Math.round(additinalDistance);
		addDistanceOnService(Math.round(additinalDistance));
	}
	
	
	public void addDistanceOnService(int additinalDistance) {
		distanceOnService += additinalDistance;
	}
	
	public void addDistanceOnService(double additinalDistance) {
		distanceOnService += additinalDistance;
	}
	
	
	public int getDistance() {
		return distance;
	}
	
	public void repair() {
			isReadyToDrive = true;
	}
	
	public void repaint() {
		color = "Black";
	}
	
	public void destroyEngine() {
		if (distance  > 200000) {
			isReadyToDrive = false;
		} else {
			isReadyToDrive = true;
		}
	}
	
	public boolean isReadyToService() {
		if(distanceOnService > 8000) {
			return true;
		} else {
			return false;
		}
	}
	 	

	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive
				+ ", distance=" + distance + ", distanceOnService=" + distanceOnService + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(color, distance, isReadyToDrive);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorcycle other = (Motorcycle) obj;
		return Objects.equals(color, other.color) && distance == other.distance
				&& isReadyToDrive == other.isReadyToDrive;
	}
	
	
	
	
}
