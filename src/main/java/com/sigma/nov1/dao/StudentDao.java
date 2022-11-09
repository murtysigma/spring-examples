package com.sigma.nov1.dao;

import com.sigma.nov1.model.Student;

public interface StudentDao {
	public void saveStudent(Student st);
	public void updateStudent(Student st);
	public void deleteStudent(Integer stuId);
	public Student getStudent(Integer stuId);
}
