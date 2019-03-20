package cn.itcast.chapter03.task01;

public class Market {
	private String marketName;
	private Product[] productArr;
	public String getMarketName() {
		return marketName;
	}
	
	public void setMarketName(String markName) {
		this.marketName = markName;
	}
	
	public Product[] getProductArr() {
		return productArr;
	}
	
	public void setProduceArr(Product[] productArr) {
		this.productArr = productArr;
	}
	
	Product sell(String name) {
		for (int i = 0; i < productArr.length; i++) {
			if (productArr[i].getProName() == name) {
				return productArr[i];
			}
		}
		return null;
	}
}
