package Methods;

public class NSRM_same_class {
	public static void main(String[] args) {
		NSRM_same_class P =new NSRM_same_class();
		P.s1();
		P.s2();
		
		NSRM_diff_class O=new NSRM_diff_class();
		O.s3();
		O.s4();
		
		
	}
	
public void s1() {
	System.out.println("i am from ns1");
	
}
	
public void s2() {
	System.out.println("i am from ns2");
	
}
}
