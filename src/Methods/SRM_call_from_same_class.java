package Methods;

public class SRM_call_from_same_class {
public static void main(String[] args) {
	

	m1();
	m2();
	
	SRM_diff_class.m3();
	SRM_diff_class.m4();
	
	
}

public static void m1() {
System.out.println("i am from m1");
	
}


public static void m2() {
	System.out.println("Iam from m2");
	
	
}


}
