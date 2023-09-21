package encapNaOops1;

public class EmpData {
	//private data variables:
	private int ssn;
	private String empName;
	private int empAge;
	
	public static void main(String[] args) {
		EmpData obj = new EmpData();
		obj.setEmpName("Tom Peter");
        obj.setEmpAge(25);
        obj.setSsn(123456);
        
        System.out.println("Employee name is: "+obj.getEmpName());
        System.out.println("Employee age is: "+obj.getEmpAge());
        System.out.println("Employee ssn is: "+obj.getSsn());
	}
	//getter and setter methods:
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	

}
