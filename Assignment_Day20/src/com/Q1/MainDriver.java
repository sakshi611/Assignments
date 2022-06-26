package com.Q1;
import java.util.*;
import java.util.stream.Collectors;
public class MainDriver {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		student.add(new Student(21, "Brijesh", 450));
		student.add(new Student(20, "Suresh", 850));
		student.add(new Student(22, "Ramesh", 953));
		student.add(new Student(25, "Vignesh", 779));
		student.add(new Student(27, "Rajesh", 800));
		
		List<Student> list = student.stream().filter(s->s.getMarks()<800).collect(Collectors.toList());
		for(Student students: list) {
			System.out.println(students);
		}

	}
	
}
