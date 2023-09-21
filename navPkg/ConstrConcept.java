package navPkg;

public class ConstrConcept {
	//System.out.println();
	public ConstrConcept() {
		System.out.println("Default Constructor");
	}
    public ConstrConcept(int i) {
    	System.out.println("single param constructor");
    	System.out.println("the value of i:"+i);
    }
    public ConstrConcept(int i,int j) {
    	System.out.println("two params constructor");
    	System.out.println("the value of i:"+i);
    	System.out.println("the value of j:"+j);
    }
	public static void main(String[] args) {
		
		ConstrConcept obj = new ConstrConcept();
		ConstrConcept obj1 = new ConstrConcept(11);
		ConstrConcept obj2 = new ConstrConcept(12,13);
	}

}
