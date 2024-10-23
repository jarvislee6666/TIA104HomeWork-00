package homework7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Homework7_02_1 {
	public static void main(String[] args) {
        Random rand = new Random();
        String filePath = "Data.txt";  // 文件名
        try {
            // 使用 FileWriter 的第二个参数 true 来启用追加模式
            FileWriter fw = new FileWriter(filePath, true);

            // 生成 10 个 1 到 1000 之间的随机整数，并追加到文件中
            for (int i = 0; i < 10; i++) {
                int randomNumber = rand.nextInt(1000) + 1;  // 生成1~1000之间的随机数
                fw.write(randomNumber + "\n");  // 将随机数写入文件并换行
            }

            // 关闭 FileWriter
            fw.close();
            System.out.println("成功将随机数追加到 " + filePath + " 文件中。");
        } catch (IOException e) {
            System.out.println("文件写入时发生错误: " + e.getMessage());
        }
    }
}
