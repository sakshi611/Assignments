package com.Q3;
import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		
		List<Student> student = new ArrayList<>();
		student.add(new Student(23, "Brijesh", 400));
		student.add(new Student(21, "Rajesh", 200));
		student.add(new Student(20, "Suresh", 300));
		student.add(new Student(19, "Ramesh", 700));
		
		List<Integer> emp = student.stream().map(s -> (s.getMarks()*1000)).collect(Collectors.toList());
	}

}
