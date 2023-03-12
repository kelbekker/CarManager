package ua.com.foxminded.carmanager;

public enum Color {

	BLACK("Black"), 
	ORANGE("Orange"), 
	WHITE("White"), 
	YELLOW("Yellow"), 
	BLUE("Blue"), 
	GREEN("Green");
	
	private String realColor;
	
	Color(String realColor) {
		this.realColor = realColor;
	}
	String getRealColor() {
		return this.realColor;
	}
}
