package com.sb.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sb.domain.Student;

public class StudentService {
	
	private List<Student> students = new ArrayList<>();
	
	public StudentService(){
		students.add(new Student(1, "Aru", Student.Status.FULL_TIME));
		students.add(new Student(2, "Sam", Student.Status.PART_TIME));
		students.add(new Student(2, "Sam", Student.Status.PART_TIME));
	}
	
	public Student getStudent(int id){
		//return new Student(1, "Aru",Student.Status.FULL_TIME);
		for (Student s : students){
			if (s.getId() == id) {
				return s;
			} else {

			}
		}
		return null;
	}

	public Student addStudent( Student s){
		students.add(s);
		return s;
	}
	
	public List<Student> getAllStudents(){
		return students;
	}
}
