package homework4;

public class Homework4_06 {
	 public static void main(String[] args) {
	        // 考試成績數據，行代表每次考試，列代表每位同學
	        int[][] scores = {
	            {10, 35, 40, 100, 90, 85, 75, 70},
	            {37, 75, 77, 89, 64, 75, 70, 95},
	            {100, 70, 79, 90, 75, 70, 79, 90},
	            {77, 95, 70, 89, 60, 75, 85, 89},
	            {98, 70, 89, 90, 75, 90, 89, 90},
	            {90, 80, 100, 75, 50, 20, 99, 75}
	        };

	        // 用來記錄每位同學考到最高分的次數
	        int[] maxScoreCount = new int[8]; // 8位同學

	        // 找出每次小考的最高分，並統計各位同學的最高分次數
	        for (int i = 0; i < scores.length; i++) { // 迴圈遍歷每次小考
	            int max = scores[i][0]; // 假設第一位同學的成績為最高分
	            for (int j = 1; j < scores[i].length; j++) { // 找出該次小考的最高分
	                if (scores[i][j] > max) {
	                    max = scores[i][j];
	                }
	            }

	            // 找出哪些同學在該次小考中得到了最高分
	            for (int j = 0; j < scores[i].length; j++) {
	                if (scores[i][j] == max) {
	                    maxScoreCount[j]++; // 如果該同學的成績等於最高分，次數+1
	                }
	            }
	        }

	        // 輸出每位同學在所有小考中獲得最高分的次數
	        for (int i = 0; i < maxScoreCount.length; i++) {
	            System.out.println("同學 " + (i + 1) + " 獲得最高分的次數: " + maxScoreCount[i]);
	        }
	    }
}
