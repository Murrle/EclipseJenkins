package package_loops;

public class Inheri_BB extends Inheri_AA {
	
	public void test(Inheri_AA a) {
		
		if(a instanceof Inheri_AA) {
			
			Inheri_BB b = (Inheri_BB)a;
			b.king();
			/*Inheri_BB obj = new Inheri_BB();
			obj.king();*/
		}	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheri_BB obj = new Inheri_BB();
		obj.test(obj);
	}

}
