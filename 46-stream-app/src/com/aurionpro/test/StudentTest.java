package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		List<Student>students=Arrays.asList(
				new Student(100,"Krutika",Arrays.asList("Singing","Sketching","Dancing")),
				new Student(100,"Rasika",Arrays.asList("Cooking","Cooking","Dancing")),
				new Student(100,"Komal",Arrays.asList("Singing","Cooking","Reading","Badminton"))
				);
				
 List<String>collect = students.stream().map(list->list.getName()).distinct().collect(Collectors.toList());
 List<String> collect2 = students.stream().flatMap(n->n.getHobbies().stream()).distinct().filter(n->n.endsWith("ing")).collect(Collectors.toList());
System.out.println(collect);//name
System.out.println(collect2);//hobbies
		
	}

}
