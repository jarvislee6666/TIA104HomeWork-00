package homework7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class Homework7_02_1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("Data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		String s = "";
		for(int i=1; i<=10;i++) {
			s += (int)(Math.random()*1000)+1 + ",";
		}

		ps.println( s );
		ps.close();
		bos.close();
		fos.close();
		
	}
}
