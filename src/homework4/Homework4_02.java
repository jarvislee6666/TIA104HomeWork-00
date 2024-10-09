package homework4;

public class Homework4_02 {
	public static void main(String[] args) {
		String s1 = "Hello World";
		String[] Array = { s1 };
		int i = s1.length() - 1;
		while (i >= 0) {
			System.out.print(s1.charAt(i));
			i--;
		}
	}
}
