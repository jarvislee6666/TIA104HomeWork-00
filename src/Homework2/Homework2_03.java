package homework2;
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
public class Homework2_03 {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		while (i<=10) {
			j*=i;
			i++;
						
			}
		
			System.out.println(j);
		}

}
