package homework7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework7_02_2 {
	public void copy(String f1 , String f2 ) throws IOException {
		File inputfile = new File(f1) ;
		File outputfile = new File(f2);
		
		FileReader fr = new FileReader(inputfile);
		BufferedReader bfr = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bfw  = new BufferedWriter(fw);
		
		int c ;
		while((c=bfr.read())!=-1) {
			bfw.write(c);
			System.out.print((char)c);
			System.out.flush();
			}
		bfr.close();
		fr.close();
		bfw.close();
		fw.close();
		
		
	}
}
