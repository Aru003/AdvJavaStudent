package com.sb.app;

import java.util.List;

import com.sb.domain.Student;
import com.sb.service.StudentService;

public class StudentApp {
	public static void main(String[] args) {
		StudentService ss =new StudentService();
		
		Student s = ss.getStudent(1);
		System.out.println(s);
		
		Student s2 = new Student(4, "Vimal", Student.Status.FULL_TIME);
		ss.addStudent(s2);
		
		s2 = ss.getStudent(4);
		System.out.println(s2);
		
		List<Student> students = ss.getAllStudents();
	}
}
