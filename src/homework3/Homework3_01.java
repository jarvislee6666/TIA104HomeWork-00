package homework3;

import java.util.Scanner;

public class Homework3_01 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;

		Scanner x = new Scanner(System.in);
		System.out.print("請輸入第一個整數");
		if (x.hasNextInt()) {
			a = x.nextInt();
		}

		System.out.print("請輸入第二個整數");
		if (x.hasNextInt()) {
			b = x.nextInt();
		}
		System.out.print("請輸入第三個整數");
		if (x.hasNextInt()) {
			c = x.nextInt();
		}

		// logic
		if (a + b > c && a + c > b && b + c > a) {

			if (a == b && b == c && a == c) {
				System.out.println("正三角形");
			} else if (a == b || b == c || a == c) {
				System.out.println("等腰三角形");
			} else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
				System.out.println("直角三角形");
			} else {
				System.out.println("一般三角形");
			}

		} else {
			System.out.println("非三角形");
		}
	}
}
