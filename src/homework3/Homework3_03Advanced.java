package homework3;

import java.util.Scanner;

public class Homework3_03Advanced {
	public static void main(String[] args) {

		Scanner hate = new Scanner(System.in);

		System.out.println("請輸入討厭的數字(1~9):");

		int num = hate.nextInt();
		
		while (num < 1 || num > 9) {
			System.out.println("輸入無效，請輸入1~9的數字");
			num = hate.nextInt();
		}

		int[] lottery = getRandom(deleteNum(num));

		System.out.println("可以參考以下6個數字:");

		int sum = 0, y = 0;

		while (sum < 6) {
			if (lottery[y] != -1) {
				System.out.print(lottery[y] + " ");
				sum++;
		}
			y++;

		}
	}

	static int[] deleteNum(int x) {

		int[] remove = new int[49];

		for (int y = 0; y < remove.length; y++) {
			if ((y + 1) % 10 == x) {
				remove[y] = -1;
			} else if (x * 10 <= (y + 1 ) && (y + 1 ) <= (x * 10) + 9) {
				remove[y] = -1;
			} else {
				remove[y] = y + 1 ;
			}

		}

		return remove;
	}

	static int[] getRandom(int[] a) {

		int x, r;

		for (int y = 0; y < a.length; y++) {

			r = (int) (Math.random() * a.length);

			x = a[y];
			a[y] = a[r];
			a[r] = x;
		}

		return a;
	}
}

