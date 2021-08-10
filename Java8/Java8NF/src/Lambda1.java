import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambda1 {

	public static void main(String[] args) {
		System.out.println("Cool Runnings!!!");
		System.out.println("Cool Runnings2!!!");
		
		/*All the functions accept a value of the type specified*/
		//Returns boolean
		Consumer prints = System.out::println;
		
		Predicate<String> p = (str)-> str.length()<10;
		prints.accept(p.test("Apples"));
		
		//Returns void
		Consumer<String> c = (str)-> System.out.println(str.contains("it"));
		c.accept("dammit");
		
		//Returns an argument of specified type
		Function<String, String> f = (str1) -> str1.concat("zzz");
		System.out.println(f.apply("xxx"));
		
		Function<Integer, String> f1 = (num)-> Integer.toString(num);
		System.out.println(f1.apply(2214333).length());
		
		Supplier<String> s = () -> "Did not understand what this could be helpgul for";
		System.out.println(s.get().toUpperCase());
		
		BinaryOperator<Integer> add = (a,b) -> (a+b);
		System.out.println(add.apply(10, 20));
		
		UnaryOperator<Integer> u = (a) -> a>10 ? 1: 0;
		System.out.println(u.apply(100));
		

	}

}
