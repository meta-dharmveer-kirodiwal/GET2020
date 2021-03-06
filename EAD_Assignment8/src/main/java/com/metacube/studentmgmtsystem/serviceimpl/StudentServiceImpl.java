package com.metacube.studentmgmtsystem.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metacube.studentmgmtsystem.dao.StudentDao;
import com.metacube.studentmgmtsystem.model.Student;
import com.metacube.studentmgmtsystem.service.StudentService;


/**
 * This class implements StudentService and override its methods to perform dao layer functions
 * @author Akanksha
 *
 */
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;
	
	/**
	 * This method is used to add student
	 * @return true if student is added else false
	 */
	public boolean addStudent(Student newStudent) {
		return studentDao.addStudent(newStudent);
	}

	/**
	 * This method returns the list of all students
	 */
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
}
