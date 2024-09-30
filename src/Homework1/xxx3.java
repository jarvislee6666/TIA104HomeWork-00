package Homework1;
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class xxx3 {
	public static void main(String[]args) {
		int i = 256559, day = i/86400 ,  hrs = (i % 86400)/3600 , min = ((i % 86400)%3600)/60 , sec = (((i % 86400)%3600)%60) ;
		
		System.out.println("256559秒為"+day+"天又"+hrs+"小時又"+min+"分又"+sec+"秒");
		
	}
}
