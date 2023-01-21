package constructor;

public class Ganapati_bappa2 {
	String ganeshname;
	int noofganeshmurthy;

	public  Ganapati_bappa2 (String shreeganesh,int noofganapati) {
		
		ganeshname =shreeganesh;
		noofganeshmurthy=noofganapati;
	
	}
	
		public void ganeshchatuthi() {
		
		for(int i=1;i<=noofganeshmurthy;i++)
		System.out.println("ganapati bappa moraya");
	
	}
		public static void main(String[] args) {
			Ganapati_bappa1 g1=new Ganapati_bappa1("dhagadushet",2);
			g1.ganeshchauti();
			
			

				Ganapati_bappa2 g2=new Ganapati_bappa2("vignaharata",1);
				g2.ganeshchatuthi();
				
		}
}
	

