import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String args[]) {
		List<Integer> coll = new ArrayList<Integer>();

		for(int i = 1 ;i<10; i++) {
			coll.add(i);
		}

		coll.forEach((a)->System.out.println(a));


		coll.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}

		});

		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		coll.forEach(action);
		
		
		coll.forEach(System.out::println);
		
		coll.stream()
		.filter((s)-> s%2==0)
		.forEach(System.out::println);
		
		Iterator< Integer> iter = coll.iterator();
		
		iter.forEachRemaining(action);
		
		coll.forEach(t->action.unacccpet(t));
		
		coll.removeIf(t->t%3==0);
		
		coll.forEach(t->action.unacccpet(t));
	}
	
}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}

	public void unacccpet(Integer t) {
		System.out.println(t+1);
	}
}