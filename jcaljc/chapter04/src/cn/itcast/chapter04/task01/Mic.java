package cn.itcast.chapter04.task01;

public class Mic implements USB{

	public void turnOn () {
		System.out.println("麦克风启动了");
	}
	
	public void turnOff () {
		System.out.println("麦克风关闭了");
	}
}
