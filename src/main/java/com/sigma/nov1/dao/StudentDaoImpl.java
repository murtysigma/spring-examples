package com.sigma.nov1.dao;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.sigma.nov1.model.Student;


public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao{

	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void saveStudent(Student st) {
		getHibernateTemplate().save(st);
	}

	@Transactional
	public void updateStudent(Student st) {
		getHibernateTemplate().update(st);
		
	}
	
	@Transactional
	public void deleteStudent(Integer stuId) {
		Student st = getStudent(stuId);
		getHibernateTemplate().delete(st);
		
	}

	public Student getStudent(Integer stuId) {
		Student st = getHibernateTemplate().get(Student.class, stuId);
		return st;
	}

}
