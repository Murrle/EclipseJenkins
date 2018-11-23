package package_loops;

public class Abs1 extends Abs {
	
public void run() {
		
		System.out.println("non abstract method");
	}
	 void test() {
	System.out.println("abstract method");	
		
	}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
Abs1 obj = new Abs1();
obj.run();
obj.test();
	}

}
