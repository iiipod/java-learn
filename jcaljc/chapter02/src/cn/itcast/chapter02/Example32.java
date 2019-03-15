package cn.itcast.chapter02;

public class Example32 {

	public static void main(String[] args) {
		int [][] arr = new int [3][];
		arr[0] = new int [] {11, 12};
		arr[1] = new int [] {21, 22, 23};
		arr[2] = new int [] {31, 32, 33, 34}; 
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int groupSum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				groupSum += arr[i][j];
			}
			sum += groupSum;
			System.out.println(groupSum);
		}
		System.out.println(sum);
	}

}
