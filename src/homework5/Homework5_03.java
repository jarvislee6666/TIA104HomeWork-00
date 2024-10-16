package homework5;

public class Homework5_03 {

	int maxElement(int x[][]) {

		int[] maxScoreCount = new int[x.length];
		int max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] == max) {
					maxScoreCount[i] = x[i][j];
				}
			}

		}
		int arraymax = 0;
		for (int z = 0; z < maxScoreCount.length; z++) {
			if (maxScoreCount[z] > arraymax) {
				arraymax = maxScoreCount[z];
			}
		}

		return arraymax;
	}

	double maxElement(double x[][]) {

		double[] maxScoreCount = new double[x.length];
		double max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] == max) {
					maxScoreCount[i] = x[i][j];
				}
			}

		}
		double arraymax = 0;
		for (int z = 0; z < maxScoreCount.length; z++) {
			if (maxScoreCount[z] > arraymax) {
				arraymax = maxScoreCount[z];
			}
		}

		return arraymax;
	}

	public static void main(String args[]) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		Homework5_03 w = new Homework5_03();
		System.out.println("intArray的最大值=" + w.maxElement(intArray));
		System.out.println("doubleArray的最大值=" + w.maxElement(doubleArray));

	}
}
