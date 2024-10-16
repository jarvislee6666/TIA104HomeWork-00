package homework5;

import java.util.Scanner;

public class MyRectangle {
	private double width;
	private double depth;

	public MyRectangle() {
		// 1.這是Java Bean的規範之一
		// 2.給日後搭配的框架工具使用(框架會利用此建構子幫我們產生物件)
	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;

	}

	public void getArea() {
		System.out.println("面積=" + width * depth);

	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.depth = depth;
	}

	public double getWidth() {

		return width;
	}

	public double getHeight() {

		return depth;
	}

}
