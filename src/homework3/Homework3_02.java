package homework3;

import java.util.Scanner;

public class Homework3_02 {
	public static void main(String[] args) {

		int bingo = (int) (Math.random() * 101);

		Scanner x = new Scanner(System.in);
		System.out.println("開始猜數字吧0-100");
		for (int num = 0; num != bingo;) {
			if (x.hasNextInt()) {
				num = x.nextInt();

			}
			if (num < 0 || num > 100) {
				System.out.println("請輸入0-100之間的數字");
			} else if (num >= 0 && num <= 100 && num < bingo) {
				System.out.println("答錯囉，小於答案");
			} else if (num >= 0 && num <= 100 && num > bingo) {
				System.out.println("答錯囉，大於答案");
			}
		}
		System.out.println("恭喜答對");
	}
}
