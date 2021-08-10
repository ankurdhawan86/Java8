import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Obj1 {
	public Obj1(String code, String name, Double cost) {
		super();
		this.code = code;
		this.name = name;
		this.cost = cost;
	}
	private String code;
	private String name;
	private Double cost;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
}

public class MapStream {

	public static void main(String args[]) {
		Map<String, List<Obj1>> map1 = new HashMap<String, List<Obj1>>();
		
		Obj1 comp1 = new Obj1("11", "iQ5", 10.00);
		Obj1 comp2 = new Obj1("12", "HDD", 20.00);
		Obj1 comp3 = new Obj1("13", "Faltu", 30.00);
		Obj1 comp4 = new Obj1("21", "iQ5", 10.00);
		Obj1 comp5 = new Obj1("22", "Faltu2", 30.00);
		
		ArrayList<Obj1> list1 = new ArrayList<Obj1>();
		
		list1.add(comp1);
		list1.add(comp2);
		list1.add(comp3);
		
		map1.put("1", list1);
		
		list1 = null;
		list1 = new ArrayList<Obj1>();
		
		list1.add(comp4);
		list1.add(comp5);
		
		map1.put("2", list1);
		
		/*
		 * List<Obj1> ListOfIq5 = map1.entrySet().stream() .collect(Collectors.toMap(,
		 * valueMapper)) .filter(e -> e.getValue().stream().filter(f ->
		 * f.getCode().equals("iQ5") )) .map(Map.Entry::getKey)
		 * .collect(Collectors.toList());
		 */
		
    List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
    System.out.println("original list: " + numbers);
    List<Integer> even = numbers.stream()
                                .map(s -> Integer.valueOf(s))
                                .filter(number -> number % 2 == 0)
                                .collect(Collectors.toList());
    System.out.println("processed list, only even numbers: " + even);
    System.out.println("Original: " + numbers);
    
    
    List<Integer> numbers2 = Arrays.asList(1,2,3,4,5,6);
    
    numbers2.stream()
            .filter(number -> number % 2 == 0)
            .collect(Collectors.toList());
    System.out.println("Original: " + numbers2);
    
  }
	
}
