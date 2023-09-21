package navPkg;

public class ThrowsKeyword {
	//System.out.println();
	public static void main(String[] args)throws ArithmeticException {
		
		ThrowsKeyword obj = new ThrowsKeyword();
			

	}
     public void sum()throws ArithmeticException {
    	 div();
     }
	public void div()throws ArithmeticException {
		
		int i = 8/0;
		
	}
}
