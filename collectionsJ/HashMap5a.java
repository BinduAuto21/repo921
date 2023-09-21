package collectionsJ;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap5a {

	public static void main(String[] args) {
		
		HashMap<Integer,String>hm = new HashMap<Integer,String>();
        
		hm.put(1, "Naveen");
		hm.put(2, "Automation");
		hm.put(3, "Labs");
		hm.put(4, "fan");
		
		System.out.println(hm.get(4));
		System.out.println(hm);
		hm.remove(4);
		
		for(Entry m:hm.entrySet()){
			
			System.out.println(m.getKey()+" "+m.getValue());
			
			}
		
		HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
		Employee e1 = new Employee("Tom",28,"QA");
		Employee e2 = new Employee("Peter",29,"Dev");
		Employee e3 = new Employee("Steve",31,"admin");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee> m:emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			
			System.out.print("Employee"+" "+key+ "Info: ");
			
			System.out.println(e.name+" "+e.age+" "+e.dept);
			
		}
		
		
		
		}

}
