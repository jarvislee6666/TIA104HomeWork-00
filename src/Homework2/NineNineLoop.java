package Homework2;
//請建立一個TestNineNine.java程式，可輸出九九乘法表
//• 一：使用for迴圈+ while迴圈
//• 二：使用for迴圈+ do while迴圈
//• 三：使用while迴圈+ do while迴圈
public class NineNineLoop {
    //for迴圈+ while迴圈
	public static void main(String[] args) {
		int a = 1, b ;
		while (a <= 9) {
			for (b = 1; b <= 9; b++) {
				System.out.print(a + "*" + b + "=" + a * b + "  ");			 
			}			
			a++;	
			System.out.println();	 		 
	    }	
		
		System.out.println("================================================================");
	//for迴圈+ do while迴圈	
		int c = 0 , d  ; 
		do {c++;
		for (d = 1; d <= 9; d++) {
			System.out.print(c + "*" + d + "=" + c * d + "  ");	
			}
		    System.out.println();
		}
		while (c <= 8); 
				
		System.out.println("================================================================");	
	//while迴圈+ do while迴圈		
		int i = 1  ; 
		    while (i<=9) {
		    	int j = 1;
		    do { 
		    	System.out.print(i + "*" + j + "=" + i * j + "  ");
		    	j++;	    
		    }  
		    while (j <= 9);	
		    System.out.println();
		    i++;
		    }
							 										 		         
    }
}


