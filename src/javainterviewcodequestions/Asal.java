package javainterviewcodequestions;

import java.util.Scanner;

public class Asal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz: ");
        int asalMi = scan.nextInt();
        if (asalMi<0) {
			System.out.println("Negatif sayı girdiniz. Asal sayılar negatif olamaz");
		}else {
		int flag = 0;
		for (int i = 2; i < asalMi; i++) {
			if (asalMi%i==0) {
				flag = 1;
			}
		}
		if (flag==1) {
			System.out.println("asal sayı değildir");
		}else {
			System.out.println("asaldır");
		}
		}
	
	
	}
	
	

}
