package homework5;

public class Homework5_02 {
	public void randAvg() {
		System.out.println("本次亂數結果:");
		double sum = 0;
		for (int i = 0; i <= 10; i++) {
			int r = (int) (Math.random() * 100) + 1;
			System.out.print(r + " ");
			sum += r;
		}
		double avg = sum / 10;
		System.out.println("\n" + "平均值 = " + avg);
	}

	public static void main(String[] args) {
		Homework5_02 f1 = new Homework5_02();
		f1.randAvg();
	}
}
