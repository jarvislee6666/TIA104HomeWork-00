package homework4;

public class Homework4_03 {
	public static void main(String[] args) {

		String[] Uni = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int count = 0;
		for (int y = 0; y < Uni.length; y++) {                // 外層控制陣列的元素位置(y軸)
			for (int x = 0; x < Uni[y].length(); x++) {       // 內層控制陣列元素的每一個字元(x軸)
				switch (Uni[y].charAt(x)) {                   // 來比每個單字是否出現母音
				case 'a', 'i', 'e', 'o', 'u':
					count = 1 + count;                        // 也可寫count++
				
				}
			}
		}

		System.out.println("總共有" + count + "個母音");

	}
}


