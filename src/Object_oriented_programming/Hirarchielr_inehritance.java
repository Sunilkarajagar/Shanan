package Object_oriented_programming;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Hirarchielr_inehritance {
public static void main(String[] args) {
	Son s=new Son ();
	s.Bike();
	s.car();
	s.Home();
	s.money();	
	System.out.println("properties of Son");
	System.out.println("s");
	
	Son1 i=new Son1 ();
	i.laptop();
	i.car();
	i.Home();
	i.money();
	System.out.println("properties of Son1'");
	System.out.println("i");
	
	Son2 j =new Son2();
	j.mobile();
	j.car();
	j.Home();
	j.money();
	System.out.println("properties of Son2");
	System.out.println("j");
	
			
}
}
