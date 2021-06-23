//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javainterviewcodequestions;

import java.util.Scanner;

public class InterviewQuestion02 {
    public InterviewQuestion02() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Before swapping: " + n1 + " - " + n2);
        double temp = n1;
        System.out.println("After swapping: " + n2 + " - " + n1);
        n1 += n2;
        n2 = n1 - temp;
        n1 -= n2;
        System.out.println("After swapping: " + n1 + " - " + n2);
    }
}
