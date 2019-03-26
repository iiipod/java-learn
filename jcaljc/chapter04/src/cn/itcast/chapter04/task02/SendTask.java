package cn.itcast.chapter04.task02;

public class SendTask {
	private String number;
	private double goodsWeight;
	
	public SendTask() {
		super();
	}
	
	public SendTask(String number, double goodsWeight) {
		this.number = number;
		this.goodsWeight = goodsWeight;
	}
	
	public void sendBefore() {
		System.out.println("订单开始处理,仓库验货中...");
		System.out.println("货物重量: " + this.getGoodsWeight() + "kg" );
		System.out.println("货物检验完毕!");
		System.out.println("货物填装完毕!");
		System.out.println("运货人已通知!");
		System.out.println("快递单号:" + this.getNumber());
	}
	
	public void send(Transportation t, GPS tool) {
		System.out.println("运货人" + t.getAdmin() + "正在驾驶编号为" + t.getNumber() + "的" + t.getModel() + "发送货物!");
		t.transport();
		String showCoordinate = tool.showCoordinate();
		System.out.println("货物当前的坐标为: " + showCoordinate);
	}
	
	public void sendAfter(Transportation t) {
		System.out.println("货物运输任务已完成!");
		System.out.println("运货人" + t.getAdmin() + "所驾驶的编号为" + t.getNumber() + "的" + t.getModel() + "已归还!");
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}	
	
	public double getGoodsWeight() {
		return goodsWeight;
	}
	
	public void setGoodsWeight(double goodsWeight) {
		this.goodsWeight = goodsWeight;
	}
}
