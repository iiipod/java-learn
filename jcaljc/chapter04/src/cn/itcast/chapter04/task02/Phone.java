package cn.itcast.chapter04.task02;

public class Phone implements GPS {
	public Phone() {
		super();
	}
	
	public String showCoordinate() {
		String location = "193,485";
		return location;
	}
}
