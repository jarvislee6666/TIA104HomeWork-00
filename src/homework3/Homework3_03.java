package homework3;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Homework3_03 {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		int dislike = 0;
		System.out.println("阿文...請輸入你討厭的數字(1~9)");
		if (x.hasNextInt()) {
			dislike = x.nextInt();
		}
		while (dislike < 1 || dislike > 9) {
			System.out.println("輸入無效，請輸入1~9的數字");
			dislike = x.nextInt();
		}
		System.out.println("阿文可以選的數字有");
		for (int i = 1; i <= 49; i++) {
			if (i % 10 == dislike || (i >= dislike * 10 && i <= dislike * 10 + 9)) {
				continue;
			}
			System.out.printf(i + " ");
		}
		int count = 0;
		for (int j = 1; j <= 49; j++) {
			if (j % 10 == dislike || (j >= dislike * 10 && j <= dislike * 10 + 9)) {
				continue;
			}
			count++;

		}
		System.out.print("\n" + "總共有" + count + "個");
	}

}
