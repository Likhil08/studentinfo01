package com.studentInfo.services;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentInfo.entity.StudentInfo;
import com.studentInfo.repository.StudentInfoRepository;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {

	@Autowired
	private StudentInfoRepository studentRepo;
	
	
	@Override
	public StudentInfo saveStudentInfo(StudentInfo studentInfo) {
		return studentRepo.save(studentInfo);
	}

	@Override
	public List<StudentInfo> getAllStudentInfo() {
		return studentRepo.findAll();
	}

	@Override
	public Optional<StudentInfo> getStudentInfoById(long id) {
		
			return	studentRepo.findAllById(id);
				
		
	}
	

}
