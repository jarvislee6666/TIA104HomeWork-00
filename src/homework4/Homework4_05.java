package homework4;

import java.util.Scanner;

public class Homework4_05 {
	public static void main(String[] args) {
		// 建立每月的天數，分為平年和閏年
		int[] daysInMonthCommonYear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] daysInMonthLeapYear = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner scanner = new Scanner(System.in);

		// 輸入年、月、日
		System.out.print("請輸入年份(yyyy): ");
		int year = scanner.nextInt();

		System.out.print("請輸入月份(mm): ");
		int month = scanner.nextInt();

		System.out.print("請輸入日期(dd): ");
		int day = scanner.nextInt();

		// 判斷是否為閏年
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		// 檢查月份範圍
		if (month < 1 || month > 12) {
			System.out.println("輸入的月份無效，必須在1到12之間");
			return;
		}

		// 檢查日期範圍
		int[] daysInMonth = isLeapYear ? daysInMonthLeapYear : daysInMonthCommonYear;// ?為三元運算子
		if (day < 1 || day > daysInMonth[month - 1]) {
			System.out.println("輸入的日期無效，該月份的天數應在1到" + daysInMonth[month - 1] + "之間");
			return;
		}

		// 計算該日期是當年的第幾天
		int dayOfYear = 0;
		for (int i = 0; i < month - 1; i++) {
			dayOfYear += daysInMonth[i]; // 加總之前月份的天數
		}
		dayOfYear += day; // 加上當前月份的天數

		// 顯示結果
		System.out.println("輸入的日期為該年第 " + dayOfYear + " 天");
	}
}
