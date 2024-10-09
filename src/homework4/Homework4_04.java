package homework4;

import java.util.Scanner;

public class Homework4_04 {
	public static void main(String[] args) {
		int borrow = 0;
		Scanner x = new Scanner(System.in);
		System.out.println("請輸欲借的金額");
		if (x.hasNextInt()) {
			borrow = x.nextInt();
		}
		if (borrow <= 0) {
			System.out.print("請重新輸入");
		} else {
			System.out.print("有錢可借的員工編號:");
			int[][] money = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
			int i = 1;
			int count = 0;
			for (int j = 0; j < money[i].length; j++) {
				if (borrow <= money[1][j]) {
					count++;
					System.out.print(money[0][j] + " ");
				}
			}
			System.out.print("共" + count + "人");
		}

	}
}
