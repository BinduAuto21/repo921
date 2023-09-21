package navPkg;

public class ExceptionHandlingA{
     
	//System.out.println();
	
	public static void main(String[] args) throws InterruptedException {
		
       //caught Exception
		//Thread.sleep(2000);    //Interrupted exception
		
		
		//Uncaught Exception
		//int i = 9/0;
		
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at navPkg.ExceptionHandlingA.main(ExceptionHandlingA.java:12)

		 */
		
		try {
		int i = 9/0;
		}catch(Throwable e) {
		
			System.out.println("exception caught by try-catch block");
			
		}
	}

}
