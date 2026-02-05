package com.predefinedfunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Ankita", "Java-Team", "Bangalore");
		Employee e2 = new Employee(101, "Mohan", "Java-Team", "HYD");
		Employee e3 = new Employee(101, "Sohan", "DB-Team", "Bangalore");
		Employee e4 = new Employee(101, "Sita", "DB-Team", "HYD");
		List<Employee> l = Arrays.asList(e1, e2, e3, e4);
		Predicate<Employee> p1 = i -> i.loc.equals("Bangalore");
		Predicate<Employee> p2 = i -> i.dept.equals("Java-Team");
		Predicate<Employee> p3 = p1.or(p2);
		for (Employee e5 : l) {
			if (p3.test(e5))
				System.out.println(e5.name);
		}
	}

}
