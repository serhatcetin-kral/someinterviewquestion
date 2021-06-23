package javainterviewcodequestions;

import java.util.Scanner;

public class AnswerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//type enter the string to reverse
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter reverse string");
		
		String str=scan.nextLine();
		
		
		StringBuffer strb=new StringBuffer();
		strb.append(str);
		System.out.print(strb.reverse());
		
		
		
		
		
		
	}

}
