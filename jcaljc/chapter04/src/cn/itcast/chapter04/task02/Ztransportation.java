package cn.itcast.chapter04.task02;

public class Ztransportation extends Transportation implements Careable {
	public Ztransportation() {
		super();
	}
	
	public Ztransportation(String number, String model, String admin) {
		super(number, model, admin);
	}
	
	public void transport() {
		System.out.println("运输进行中...");
	}
	
	public void upKeep() {
		System.out.println("货物运输车辆保养完毕!");
	}
	
}
