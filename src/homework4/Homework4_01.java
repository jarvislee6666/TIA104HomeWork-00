package homework4;

public class Homework4_01 {
	public static void main(String[] args) {
		int[] intArray = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		int avg = sum / intArray.length;
		System.out.println("陣列中所有數字的平均值=" + avg);
		System.out.print("陣列中大於平均值的數字有:");
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > avg) {
				System.out.print(intArray[i] + " ");
			}
		}

	}

}
