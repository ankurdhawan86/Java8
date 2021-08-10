package com.adhawan.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HowItWasDoneBefore {


	public static void main(String args[]) {
		List<Person> people = Arrays.asList(
				new Person("Ankur", "Dhawan", 35),
				new Person("Aryan", "Dhawan", 5),
				new Person("Gaurav", "Sharma", 18),
				new Person("Tanu", "Dhawan", 34),
				new Person("Simran", "Khurana", 22)
				);
		
		//Sort by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLname().compareTo(o2.getLname());
			}
		});
		
		
		//Print all the elements
		System.out.println("Print all the elements");
		printAll(people);
			
		
		//Print all the people with last name beginning with D
		System.out.println("Print all the people with last name beginning with D");
		printConditionally(people, new Condition<Person>() {

			@Override
			public boolean test(Person p) {
				return p.getLname().startsWith("D");
			}
			
		});	
		
		//Print all the people with first name beginning with A
		System.out.println("Print all the people with first name beginning with A");
		printConditionally(people, new Condition<Person>() {

			@Override
			public boolean test(Person p) {
				return p.getFname().startsWith("A");
			}
			
		});
	}
	
	private static void printAll(List<Person> list) {
		for (Person p : list) {
			System.out.println(p);
		}
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


