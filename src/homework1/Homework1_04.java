package homework1;
//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
public class Homework1_04 {
	public static void main(String[]args) {
		final double i = 3.1415;
		int	j = 5 ;
		double value1 =(j*j)*i; 
		double value2 =(j*2)*i;
		
		System.out.printf("圓面積="+"%.4f%n",value1);
		System.out.println("=========================");
		System.out.printf("圓周長="+"%.4f",value2);
	}
}