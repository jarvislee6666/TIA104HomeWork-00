package homework2;
//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
public class Homework2_01 {
	public static void main(String[] args) {
		int j = 0;
		for (int i=2; i<=1000; i=i+2) {
			j+=i;
				
			}
			
			System.out.println(j);
		}
}
