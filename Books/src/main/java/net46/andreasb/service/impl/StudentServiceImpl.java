package net46.andreasb.service.impl;

import java.util.List;

import net46.andreasb.dao.StudentDao;
import net46.andreasb.model.Student;
import net46.andreasb.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	public void add(Student student) {
		studentDao.add(student);
	}
	
	@Transactional
	public void edit(Student student) {
		studentDao.edit(student);
	}

	@Transactional
	public void delete(int bookId) {
		studentDao.delete(bookId);
	}

	@Transactional
	public Student getStudent(int bookId) {
		return studentDao.getStudent(bookId);
	}

	@Transactional
	public List getAllStudent() {
		return studentDao.getAllStudent();
	}
	@Transactional
	public void numberm(Student student) {
		studentDao.numberm(student);
		
	}

}
