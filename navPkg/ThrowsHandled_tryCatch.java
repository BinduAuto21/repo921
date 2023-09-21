package navPkg;

public class ThrowsHandled_tryCatch {

	public static void main(String[] args) {
		
		ThrowsHandled_tryCatch obj = new ThrowsHandled_tryCatch();
			

	}
     public void sum() {
    	 div();
     }
	public void div() {
		try {
		int i = 8/0;
		}catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("Throws handled with try-catch block");
		}
	}

	}


