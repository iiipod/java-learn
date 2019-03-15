package cn.itcast.chapter02;

public class Example31 {

	public static void main(String[] args) {
		int [] arr = {9, 8, 3, 5, 2};
		System.out.print("冒泡排序前:");
		printArray(arr);
		bubbleSoft(arr);
		System.out.print("冒泡排序后:");
		printArray(arr);
	}
	
	public static void printArray(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}
	
	public static void bubbleSoft(int [] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print("第" + (i + 1) +"轮排序后:");
			printArray(arr);
		}
	}

}
