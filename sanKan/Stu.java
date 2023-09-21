package sanKan;

public class Stu {
	
	String name;
	int age;
	
	public Stu() {
//		System.out.println(name);
//		System.out.println(age);
	}
	
	Stu(String name, int age){
//		this.name=name;
//		this.age=age;
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		Stu obj1 = new Stu();
		System.out.println("object1 name:"+obj1.name);
		System.out.println("object1 age:"+obj1.age);
		
		Stu obj2 = new Stu("Peter",33);
//		System.out.println("object2 name:"+obj2.name);
//		System.out.println("object2 age:"+obj2.age);

	}

}
