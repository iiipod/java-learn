package cn.itcast.chapter02;

public class StoreList {
	public static void main(String[] args) {
		String model1 = "MacBookAir";
		float size1 = 13.3f;
		float price1 = 6988.88f;
		String peizhi1 = "i5处理器4GB内存128G固态硬盘";
		int kucun1 = 5;
		
		String model2 = "ThinkPadT450";
		float size2 = 14.0f;
		float price2 = 5999.99f;
		String peizhi2 = "i5处理器4GB内存500G硬盘";
		int kucun2 = 10;
		
		String model3 = "ASUS-FL5000";
		float size3 = 15.6f;
		float price3 = 4999.5f;
		String peizhi3 = "i7处理器4GB内存128G固态硬盘";
		int kucun3 = 18;
		
		System.out.println("---------------------商城库存清单---------------------");
		System.out.println("品牌型号		 尺寸		价格				配置					库存数");
		System.out.println(model1 + "\t " + size1 + "\t\t   " + price1 + "\t  " + "\t  " + peizhi1 + "\t  " + kucun1);
		System.out.println(model2 + "\t " + size2 + "\t\t   " + price2 + "\t  " + "\t  " + peizhi2 + "\t\t  " + kucun2);
		System.out.println(model3 + "\t " + size3 + "\t\t   " + price3 + "\t  " + "\t  " + peizhi3 + "\t  " + kucun3);
		System.out.println("--------------------------------------------------------------");
		int totalcount = kucun1 + kucun2 + kucun3;
		float totalmoney = (price1 * kucun1) + (price2 * kucun2) + (price3 * kucun3);
		System.out.println("总库存数:" + totalcount);
		System.out.println("库存商品总金额:" + totalmoney);
	}
}
