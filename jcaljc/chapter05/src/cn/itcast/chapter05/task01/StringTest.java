package cn.itcast.chapter05.task01;

public class StringTest {

	public static void main(String[] args) {
		String str = "nbaernbatnbaynbauinbaopnba";
		String key = "nba";
		int count = getKeyStringCount(str, key);
		System.out.println("count = " + count);
	}
	
	public static int getKeyStringCount(String str, String key) {
	
		int count = 0;
		if (str.contains(key)) {
			while (str.indexOf(key) != -1) {
				count += 1;
				str = str.substring(key.length() + str.indexOf(key));
	//			System.out.println(str);
			}
		} else {
			count = 0;
		}
		return count;
	}
}
