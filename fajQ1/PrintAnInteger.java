package fajQ1;

import java.util.Scanner;
    
//System.out.println();

public class PrintAnInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//sc.close();
		
		System.out.println("Plz enter a number:");
		
		int num1 = sc.nextInt();
		
		System.out.println("you entered: "+num1);
		sc.close();
	}

}
