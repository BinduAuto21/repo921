package sanKan;

public class Student {
	
	String name;
	int rno;
	
	Student(){
		String name = "Bhagchi";
		int rno = 34;
	}
	
	Student(String str,int n)
	{
		System.out.println(str);
		System.out.println(n);
	
//		this.name = str;
//		this.rno= n;
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1.name);
		System.out.println(s1.rno);
		
		Student s2 = new Student("Abi", 34);
		System.out.println(s2.name);
		System.out.println(s2.rno);
		
	

		
	}
}
