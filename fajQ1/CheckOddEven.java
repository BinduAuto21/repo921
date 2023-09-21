package fajQ1;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Plz enter a number: ");
		
		int num = reader.nextInt();
		
		System.out.println(num);
		
		
		if(num % 2==0) {
			System.out.println("num is even");
		}else {
			System.out.println("num is odd");
		}

		}
	   
}