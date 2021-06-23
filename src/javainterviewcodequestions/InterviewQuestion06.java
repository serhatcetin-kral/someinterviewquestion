package javainterviewcodequestions;

import java.util.Scanner;

public class InterviewQuestion06 {

    public static void main(String[] args) {
     
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println(" please enter a string polIdromE or not");
    	
    	String str=scan.nextLine().replace(" ", "").toLowerCase();
    
    	isPolidrom(str);
    
    	scan.close();
    	
    	
    }
	
    public static void isPolidrom(String str) {
    	
    	String revStr="";
    	
    	
    	for(int i=str.length()-1;i>=0;--i) {
    		
    		revStr=revStr+str.charAt(i);
    		
    		
    	}
    	
    	if(revStr.equals(str)) {
    		System.out.print(str+" is polidrome");
    	}else {System.out.print(str+" is not polidrome");
    		
    	}
    	
    	
    	
    }
	
	
	
	
	
}
