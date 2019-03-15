package cn.itcast.chapter02;

public class Example30 {

	public static void main(String[] args) {
		int[] arr = {4, 1, 6, 3, 9, 8, 21, 15};
		
		int max = getMax(arr);
		
		System.out.println("max = " + max);
	}
	
	public static int getMax(int [] arr) {
		int max = arr[0];
		
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		return max;
	}

}
