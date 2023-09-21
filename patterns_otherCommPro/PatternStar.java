package patterns_otherCommPro;

public class PatternStar {

	public static void main(String[] args) {
		
       for(int row=1;row<=4;row++) {
    	   for(int col=1;col<=row;row++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
	}
    
}
