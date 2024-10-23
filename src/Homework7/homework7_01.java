package homework7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Homework7_01 {
    public static void main(String args[]) {
        int i;
        int byteCount = 0;   // 用来统计位元组（byte）
        int charCount = 0;   // 用来统计字符数（包含空格、标点等）
        int lineCount = 0;   // 用来统计行数

        try {
           	
            FileReader fr = new FileReader("c:\\javawork\\Sample.txt");
            while ((i = fr.read()) != -1)
                System.out.print((char)i);
            fr.close();
        } catch(IOException e){}
        
        try {
            FileReader fr = new FileReader("c:\\javawork\\Sample.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            // 逐行读取文件
            while ((line = br.readLine()) != null) {
                // 去掉行首尾的空格后检查是否为空行
                if (!line.trim().isEmpty()) {
                    lineCount++;  // 仅在该行不是空行时，计数加1
                }

                // 累加字符数
                charCount += line.length();  // line.length() 会计算该行所有字符

                // 统计字节数
                byteCount += line.getBytes().length;  // 统计每行的字节数
            }

            br.close();

            // 输出文件信息
            System.out.println("===============================");
            System.out.println("\n文件共有 " + byteCount + " 個位元組");
            System.out.println("文件共有 " + charCount + " 個字符");
            System.out.println("文件共有 " + lineCount + " 列資料（空白列不計）");

        } catch (IOException e) {
            System.out.println("文件读取时发生错误: " + e.getMessage());
        }
    }
}
