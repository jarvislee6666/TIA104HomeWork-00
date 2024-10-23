package homeworkext;

abstract class Pen {
	protected String brand;
	protected double price;

	// 保留無參數的建構子
	public Pen() {
		// 1.這是Java Bean的規範之一
		// 2.給日後搭配的框架工具使用(框架會利用此建構子幫我們產生物件)
	}

	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;

	}

	public abstract void write(String brand, double pric);

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}
}

class Pencil extends Pen {
	// 定義抽象類別的動作
	public void write(String brands, double prices) {
		System.out.println("削鉛筆再寫");
		System.out.print("牌子是：" + brand + " ");
		System.out.println("價格為：" + price * 0.8);
	}

}

class InkBrush extends Pen {
	// 定義抽象類別的動作
	public void write(String brands, double prices) {
		System.out.println("沾墨汁再寫");
		System.out.print("牌子是:" + brand + " ");
		System.out.println("價格為：" + price * 0.9);
	}

}

public class TestPen {
	public static void main(String args[]) {
		Pen myPen1 = new Pencil();
		Pen myPen2 = new InkBrush();
		myPen1.write("SKB", 20.0);
		myPen2.write("毛筆", 20.0);
	}
}
