package net46.andreasb.dao.impl;

import java.util.List;

import net46.andreasb.dao.StudentDao;
import net46.andreasb.model.Student;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Student student) {
		session.getCurrentSession().save(student);
	}
	@Override
	public void numberm(Student student) {
		session.getCurrentSession().save(student);
	}

	@Override
	public void edit(Student student) {
		session.getCurrentSession().update(student);
	}

	@Override
	public void delete(int bookID) {		
		session.getCurrentSession().delete(getStudent(bookID));
	}

	@Override
	public Student getStudent(int bookID) {
		return (Student)session.getCurrentSession().get(Student.class, bookID);
	}

	@Override
	public List getAllStudent() {
		return session.getCurrentSession().createQuery("from Student").list();
	}

}
