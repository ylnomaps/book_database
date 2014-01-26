package net46.andreasb.service;

import java.util.List;

import net46.andreasb.model.Student;

public interface StudentService {
	public void add(Student student);
	public void edit(Student student);
	public void delete(int bookId);
	public Student getStudent(int bookId);
	public List getAllStudent();
	public void numberm(Student student);
}
