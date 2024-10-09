package homework1;
//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
public class Homework1_06 {
	public static void main(String[]args) {
		
		System.out.println(5+5);//兩個5都是值，會相加
		System.out.println(5+'5');//第一個5是值，第二個5型態為char，依照ASCII表對照出來的值為53，故53+5=58
		System.out.println(5+"5");//第一個5是值，第二個5是字串

	}
}
