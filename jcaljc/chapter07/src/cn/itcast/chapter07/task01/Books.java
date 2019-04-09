package cn.itcast.chapter07.task01;

public class Books {

	int id;
	String name;
	double price;
	int number;
	double money;
	String publish;
	
	public Books(int id, String name, double price, int number, double money, String publish) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
		this.money = money;
		this.publish = publish;
		
	}
	
	@Override
	public String toString() {
		
		String message = "图书编号: " + id +" 图书名称: " + name + " 出版社: " + publish + " 单价: " + price + "库存数量: " + number;
		return message;
				
	}
	
	public void setNumber(int number) {
		
		this.number = number;
		
	}
	
}
