package homework2;
//請設計一隻Java程式,輸出結果為以下:
//1 4 9 16 25 36 49 64 81 100
public class Homework2_04 {
	public static void main(String[] args) {
		int j = 0;
		for (int i=1; i<=20; i++) {
			if(i % 2 == 0) {	
			continue;							
			}
			
			j+=i;			
			System.out.printf(j+" ");
		
		}
    }
}