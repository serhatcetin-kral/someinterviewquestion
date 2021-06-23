package javainterviewcodequestions;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// verilen Stringi tersden yazma
		
		
	Scanner scan=new Scanner(System.in);
		System.out.println("lutfen ter yazdirmak istediginiz Stringi giriniz");
		String str=scan.nextLine();
		
		StringBuilder revstr=new StringBuilder(str);
		
		//revstr.append(str);
		
		
	System.out.println(revstr.reverse());
		
	}

	 
	Reverse(int a,int b);
	
	reverse(int a);
	
	
}
