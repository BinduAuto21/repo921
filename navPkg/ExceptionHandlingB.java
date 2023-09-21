package navPkg;

public class ExceptionHandlingB {
      
	//System.out.println();
	 
	int i=11;
	
	public static void main(String[] args) {
		
		ExceptionHandlingB obj = new ExceptionHandlingB();
		obj=null;
		
		//System.out.println(obj.i);
		/*
		 * Exception in thread "main" java.lang.NullPointerException: Cannot read field "i" because "obj" is null
	at navPkg.ExceptionHandlingB.main(ExceptionHandlingB.java:14)

		 */
		try {
		int j=obj.i;
		}catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("Null Pointer exception being handled by try-catch block");	
		}
		
	}

}
