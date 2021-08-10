
public class LambdaCalc {

	public static void main(String[] args) {
		Calculate add = (a,b) -> a+b;
		Calculate sub = (a,b) -> Math.abs(a-b);
		Calculate mult = (a,b) -> a*b;
		Calculate div = (a,b) -> b==0? 0: a/b;
		
		System.out.println(add.calc(2, 3));
		System.out.println(sub.calc(2, 3));
		System.out.println(mult.calc(2, 3));
		System.out.println(div.calc(32, 3));
	}

}
