package navPkg;

import java.util.ArrayList;

import com.google.common.collect.ObjectArrays;

public class ExceptionHandlingC {
      //System.out.println();
	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Naveen");
		ar.add("Automation");
		ar.add("Labs");
		
		System.out.println(ar.size());
		
		//for loop:
//		for(int i=0;i<ar.size();i++) {
//			System.out.print(ar.get(i)+" ");
//		}
		System.out.println("***advance for loop****");
		//advance for loop
//		for(String str:ar) {
//			System.out.print(str+" ");
//		}
		   
		   //uncaught ArrayOutOfBoundsException
	 //      String str=ar.get(3);
	       
	       /*
	        * Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
	        */
		try {
		String str = ar.get(4);
		}catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("IndexOutOfBoundsException caught using try-catch block");	
			
		}
		System.out.println("Error caught");
	}

}
