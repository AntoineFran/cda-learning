package com.afpa.learning.dao;

import java.util.ArrayList;
import java.util.List;

import com.afpa.learning.model.Subject;

public class SubjectDAOImp implements ISubjectDAO {

	@Override
	public List<Subject> getSubject() {

		List<Subject> vSubjects = new ArrayList<>();
		return vSubjects;
	}

	@Override
	public Subject addSubject(Subject pSubject) {
		Subject vSubject = new Subject();
		return vSubject;
	}

	@Override
	public Subject showSubjectById(int pId) {
		Subject vSubject = new Subject();
		return vSubject;
	}

	@Override
	public Subject updateSubjectById(Subject pSubject) {
		Subject vSubject = new Subject();
		return vSubject;
	}

	@Override
	public void deleteSubjectById(int pId) {
		
	}

}
