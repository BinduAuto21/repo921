package sanKan;

public class Variable10 {
	int a=10;
	static int c=30;
	public static void main(String[] args) {
		
		int b=20;
		
		Variable10 v=new Variable10();
		
		System.out.println("instance Variable: "+v.a);
		System.out.println("local Variable: "+b);
		System.out.println("static variable: "+c);
		System.out.println();
		
		
		
	}

}
