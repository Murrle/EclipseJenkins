package package_loops;

public abstract class Abs {

	Abs(){
		
		System.out.println("Constructor");
	}
	public void run() { //Non- Abstract method
		
		System.out.println("non abstract method");
	}
	
	abstract void test(); //non- Abstract method
		
		
	
}
// if u have abstract u shouldnot have any code in it
//Abstratct will hide the actual code and will show only its implemenations

//Abstarction can be achieved in 2 ways
//1. Abstract class(o to 100%)
//2. Interface (100%)
//rules:
// Abstartct class must be declared with abstract keyword
//it can havce moth Abstarct and non-abs methods
//it cannot be Instantated
//it can have constructor and static method
//it can have a finalmethod also


