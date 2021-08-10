import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

class GenericClass<T, U> { 
    T obj1;  // An object of type T 
    U obj2;  // An object of type U 
  
    // constructor 
    GenericClass(T obj1, U obj2) { 
        this.obj1 = obj1; 
        this.obj2 = obj2; 
    } 
  
    // To print objects of T and U 
    public void print() { 
        System.out.println(obj1); 
        System.out.println(obj2); 
    } 
} 
  
// Driver class to test above 
class Generics1 { 
    public static void main (String[] args) { 
    	GenericClass <String, Integer> obj = 
            new GenericClass<String, Integer>("Generic Class Example !", 100); 
  
        obj.print(); 
        
        int min2 = Arrays.stream(new int[]{})
        		  .min()
        		  .orElse(0);
        		//assertEquals(0, min2);
        
        List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);
        //findNumbers(list, Numbers::isMoreThanFifty);
    } 
}


class Numbers {
	  public static boolean isMoreThanFifty(int n1, int n2) {
	    return (n1 + n2) > 50;
	  }
	  public static List<Integer> findNumbers(List<Integer> l, BiPredicate<Integer, Integer> p) {
	      List<Integer> newList = new ArrayList();
	      for(Integer i : l) {
	        if(p.test(i, i + 10)) {
	          newList.add(i);
	        }
	      }
	      return newList;
	  }
	}