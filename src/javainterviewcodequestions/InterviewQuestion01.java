//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javainterviewcodequestions;

import java.util.Scanner;

public class InterviewQuestion01 {
    public InterviewQuestion01() {
    }

    public static void main(String[] args) {
      
    Scanner scan=new Scanner(System.in);
    
    System.out.println("plese enter a String for reverse");
    String str=scan.nextLine();
    
    
    reverse(str);
    
    }

    public static void reverse(String str) {
    	
    	String rev="";
    	for(int i=str.length()-1;i>=0;--i) {
    		
    		rev=rev+str.charAt(i);
    		
    	}
    	System.out.print(rev);
    }



}
