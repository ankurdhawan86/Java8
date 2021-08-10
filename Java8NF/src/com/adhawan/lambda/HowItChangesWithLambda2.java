package com.adhawan.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.adhawan.lambda.HowItWasDoneBefore.Condition;

public class HowItChangesWithLambda2 {


	public static void main(String args[]) {
		List<Person> people = Arrays.asList(
				new Person("Ankur", "Dhawan", 35),
				new Person("Aryan", "Dhawan", 5),
				new Person("Gaurav", "Sharma", 18),
				new Person("Tanu", "Dhawan", 34),
				new Person("Simran", "Khurana", 22)
				);
		
		//Sort by last name
		Collections.sort(people, (p1,p2) -> p1.getLname().compareTo(p2.getLname()));
		
		
		//Print all the elements
		System.out.println("Print all the elements");
		printConditionally(people,p->true);
			
		
		//Print all the people with last name beginning with D
		System.out.println("Print all the people with last name beginning with D");
		printConditionally(people, (p) -> p.getLname().startsWith("D"));	
		
		//Print all the people with first name beginning with A
		System.out.println("Print all the people with first name beginning with A");
		printConditionally(people, (p) -> p.getFname().startsWith("A"));
	}
	
	private static void printConditionally(List<Person> list, Condition condition) {
		for (Person p : list) {
			if(condition.test(p))
				System.out.println(p);
		}
	}
	
	interface Condition<T> {
		public boolean test(Person p);
	}

}
