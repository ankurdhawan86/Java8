import java.util.stream.Stream;

public class ReduceTest {

	public static void main(String[] args) {
		double total = Stream.of(3.3, 4.7, 6.9)
				.reduce(0.0, (a,b)->a+b);
		System.out.println(total);

	}

}
