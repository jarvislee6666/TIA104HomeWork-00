package homework5;

import java.util.Scanner;

public class Homework5_01 {
	private int width;
	private int height;

	public Homework5_01() {
		// 1.這是Java Bean的規範之一
		// 2.給日後搭配的框架工具使用(框架會利用此建構子幫我們產生物件)
	}

	public Homework5_01(int width, int height) {
		this.width = width;
		this.height = height;

	}

	public void speak() {
		System.out.println("請輸入寬與高");
		Scanner x = new Scanner(System.in);
		if (x.hasNextInt()) {
			width = x.nextInt();
		}
		Scanner y = new Scanner(System.in);
		if (y.hasNextInt()) {
			height = y.nextInt();
		}
		int[][] rectangle = new int[height][width];
		if (height == width) {
			System.out.println("長方形寬與高不得相同，請重新輸入");
		} else {
			for (int i = 0; i < rectangle.length; i++) {

				for (int j = 0; j < rectangle[i].length; j++) {
					System.out.printf("*");
				}
				System.out.println();
			}

		}
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		Scanner x = new Scanner(System.in);
		if (x.hasNextInt()) {
			width = x.nextInt();
		}
		return width;
	}

	public float getHeight() {
		Scanner y = new Scanner(System.in);
		if (y.hasNextInt()) {
			height = y.nextInt();
		}
		return height;
	}

	public static void main(String[] args) {
		Homework5_01 f1 = new Homework5_01();

		f1.speak();

	}
}
