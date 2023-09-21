package navPkg;

public class ConstWithThisKW {
	
	String name;
	int age;
    
	public ConstWithThisKW(String name,int age) {
		System.out.println(name);
		System.out.println(age);
		
	}
	public static void main(String[] args) {
		ConstWithThisKW obj = new ConstWithThisKW("Tom",30);

	}
}