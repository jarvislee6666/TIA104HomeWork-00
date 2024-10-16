package homework5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Homework5_05 {
	public static void main(String[] args) {
		Set set = new HashSet();
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		while (set.size() != 8) {
			Random random = new Random();
			int index = random.nextInt(chars.length());
			char append = (chars.charAt(index));
			set.add(append);
		}

		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}
	}

}
