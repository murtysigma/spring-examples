package com.sigma.nov1.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sigma.nov1.dao.StudentDao;
import com.sigma.nov1.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentDao dao;
	
	
	@RequestMapping("/addStudent")
	public ModelAndView addStudent() {
		ModelAndView mv = new ModelAndView("addStudent");
		return mv;
	}
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView("WEB-INF/views/hello.jsp");
		return mv;
	}
	
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(HttpServletRequest request) throws ParseException {
		Student st = new Student();
		st.setStuId(Integer.parseInt(request.getParameter("stu_id")));
		st.setFirstName(request.getParameter("first_name"));
		st.setLastName(request.getParameter("last_name"));
		String date = request.getParameter("date_of_joining");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date joinginDate= formatter.parse(date);  
		st.setJoiningDate(joinginDate);
		dao.saveStudent(st);
		ModelAndView mv = new ModelAndView("student_success");
		return mv;
	}
}
