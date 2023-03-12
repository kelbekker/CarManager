package ua.com.foxminded.carmanager;

public interface Serviceble {
	
	public abstract boolean isReadyToService();
	
	public void service();
	
	public int getDistanceOnService();
	
	public void addDistanceOnService(int additinalDistance);
	
	public int getDistance();
	
	public void addDistance(double additinalDistance);
	
	public void addDistance(int additinalDistance);
	
	public void addDistanceOnService(double additinalDistance);
	
	

}
