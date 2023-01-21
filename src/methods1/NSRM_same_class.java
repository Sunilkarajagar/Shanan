package methods1;

public class NSRM_same_class {
public static void main(String[] args) {
	
	NSRM_same_class p=new NSRM_same_class();
			
	p.C1();
	p.C2();
	
	NSRM_diff_class s=new NSRM_diff_class();
	s.D1();
	s.D2();
	

	
	
}

public void C1() {
	System.out.println("i am from C1");
	
}
public void C2() {
	System.out.println("i am from C2");
	
}



}
