package homework6;

import java.util.Scanner;

public class Calculator {

	public static int powerXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {

			throw new CalException("x 和 y 不可以同時為 0！");
		}

		if (y < 0) {

			throw new CalException("次方為負值，結果回傳不為整數！");
		}

		return (int) Math.pow(x, y);
	}

}
