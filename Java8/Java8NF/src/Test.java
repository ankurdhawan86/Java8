import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {
		Map myMap = new HashMap(10);
		//add the key “John”
		UserKey key = new UserKey("John"); //Assume UserKey class is mutable
		myMap.put(key, "Sydney");
		//now to add the key “Sam”
		key.setName("Sam"); // same key object is mutated instead of creating a new instance.
		 // This line modifies the key value “John” to “Sam” in the “List of keys”
		 // as shown in the diagram above. This means that the key “John” cannot be
		 // accessed. There will be two keys with “Sam” in positions with hash
		 // values 345678965 and 76854676.
		myMap.put(key, "Melbourne");
		myMap.get(new UserKey("John")); // k
		
		List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);

		List<Integer> returnedList = null;
		
		// Using an anonymous class
		returnedList = Numbers2.findNumbers(list, new BiPredicate<Integer, Integer>() {
		  public boolean test(Integer i1, Integer i2) {
		    return Numbers.isMoreThanFifty(i1, i2);
		  }
		});

		System.out.println(returnedList.toString());
		
		// Using a lambda expression
		returnedList = Numbers2.findNumbers(list, (i1, i2) -> Numbers.isMoreThanFifty(i1, i2));
		System.out.println(returnedList.toString());
		
		// Using a method reference
		returnedList = Numbers2.findNumbers(list, Numbers::isMoreThanFifty);
		System.out.println(returnedList.toString());
	}

}


class Numbers2 {
	  public static boolean isMoreThanFifty(int n1, int n2) {
	    return (n1 + n2) > 50;
	  }
	  public static List<Integer> findNumbers(List<Integer> l, BiPredicate<Integer, Integer> p) {
	      List<Integer> newList = new ArrayList<>();
	      for(Integer i : l) {
	        if(p.test(i, i + 10)) {
	          newList.add(i);
	        }
	      }
	      return newList;
	  }
	}

class UserKey {
	String name;
	
	UserKey(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
