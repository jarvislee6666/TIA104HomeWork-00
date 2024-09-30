package Homework1;
//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,
//請用程式計算10年後,本金加利息共有多少錢 (用複利計算)
public class xxx5 {
	public static void main(String[]args) {
		int pv = 1500000;
		double	r = 0.02 ;
		double fv = 0 ;
		for (double n= 1 ;n <= 10 ; n++) 
			 fv =pv * Math.pow (1+r,n);

		System.out.printf("本金加利息總共為"+"%.0f",fv);
		
	}
}
