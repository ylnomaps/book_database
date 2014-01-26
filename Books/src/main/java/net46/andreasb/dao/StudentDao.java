package net46.andreasb.dao;

import java.util.List;

import net46.andreasb.model.Student;

public interface StudentDao {
	public void add(Student student);
	public void edit(Student student);
	public void delete(int bookID);
	public Student getStudent(int bookID);
	public List getAllStudent();
	public void numberm(Student student);
}
