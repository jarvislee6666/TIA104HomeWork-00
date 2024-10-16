package homework6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {

		try {

			System.out.print("請輸入x的值");
			Scanner i = new Scanner(System.in);
			int x = 0;
			if (i.hasNextInt()) {
				x = i.nextInt();
			}

			System.out.print("請輸入y的值");
			Scanner j = new Scanner(System.in);
			int y = 0;
			if (j.hasNextInt()) {
				y = j.nextInt();
			}

			int result = Calculator.powerXY(x, y);
			System.out.println(x + " 的 " + y + " 次方等於 " + result);

		} catch (NumberFormatException e) {

			System.out.println("輸入格是不正確，請輸入整數！");
		} catch (CalException e) {

			System.out.println(e.getMessage());
		}

	}
}
