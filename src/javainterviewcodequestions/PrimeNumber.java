package javainterviewcodequestions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  find prime number or not
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a prime number");
		int num=scan.nextInt();
		primeCalculator(num);
		
		scan.close();
	}
	
	public static void primeCalculator(int num) {
		int count=0;
		if(num>0) {
			
			if(num==1) {
				
				System.out.print(num+" is a prime");
			}else {
				
				for(int i=2;i<num;i++) {
					if(num%i==0) {
						count++;
					}
					
				}
				if(count==0) {
					System.out.print(num+" is a prime");
				}else {
					System.out.print(num+" is not prime");
				}
			}
			
			
		}
		else {
			System.out.print("please enter a pozitif number");
		}
		
		
		
	}

}
