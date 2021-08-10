
public class CallByValue {

	public static void main(String args[]) {
		Callee callee = new Callee();
		callee.meth1(10,20);
		Callee2 callee2 = new Callee2();
		callee2.meth1(10,20);
	}
	

}

class Callee {
		
	public void meth1(int a, int b) {
		meth2(a, b);
		System.out.println(a + " " + b);
	}
	
	void meth2(int a, int b) {
		a=a+5;
		b=b+5;
		System.out.println(a + " " + b);
	}
}

class Callee2 {
		
	public void meth1(Integer a, Integer b) {
		meth2(a, b);
		System.out.println(a + " " + b);
	}
	
	void meth2(Integer a, Integer b) {
		a=a+5;
		b=b+5;
		System.out.println(a + " " + b);
	}
}