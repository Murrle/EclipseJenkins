// IF condition
// unmute your microphone


package package_loops;

public class ConditionalStats {

	public void looping(int a) {
		int i;
		
		for(i=1;i<=a;i++) {
		System.out.println(i);
		}
		
	}
	public void comapriosn(int a , int b , int c) {
		if(a>b && a>c) {
			
			System.out.println("a is big " +a);
				
		}
		else if (b>a && b>c) {
			
			System.out.println("b is big "+b);
		}

		else {
			
			System.out.println("c is big "+c);
		}

	
	} 

public static void main(String[] args) {
		int a;
		int b;
		int c;	
		ConditionalStats refvar = new ConditionalStats();
		refvar.comapriosn(20, 30, 10);
		refvar.looping(10);
	}

}
