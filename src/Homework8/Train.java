package Homework8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Train {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	// 保留無參數的建構子
	public Train() {
		// 1.這是Java Bean的規範之一
		// 2.給日後搭配的框架工具使用(框架會利用此建構子幫我們產生物件)
	}

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;

	}

	public String toString() {
		return "Train{" + "班次=" + number + ", 車種='" + type + '\'' + ", 出發地='" + start + '\'' + ", 目的地='" + dest + '\''
				+ ", 票價=" + price + '}';
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public String getStart() {
		return start;
	}

	public String getDest() {
		return dest;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Train train = (Train) o;
		return number == train.number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	public static void main(String[] args) {
		Set<Train> trains = new HashSet<>();
		trains.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trains.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trains.add(new Train(118, "自強", "高雄", "台北", 500));
		trains.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trains.add(new Train(122, "自強", "台中", "花蓮", 600));
		trains.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trains.add(new Train(1254, "區間", "屏東", "基隆", 700));

		// 步驟3：列印所有列車物件（不會有重複的班次）
		System.out.println("所有列車物件（無重複）：");
		for (Train train : trains) {
			System.out.println(train);
		}

		System.out.println("\n(迭代器)所有列車物件（無重複）：");
		Iterator objs = trains.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());

		// 步驟4：將列車物件按班次編號從大到小排序
		List<Train> trainList = new ArrayList<>(trains);
		trainList.sort((t1, t2) -> Integer.compare(t2.getNumber(), t1.getNumber()));

		System.out.println("\n按班次編號從大到小排序的列車物件：");
		for (Train train : trainList) {
			System.out.println(train);
		}

	}

}
