package com.afpa.learning.service;

import java.sql.Date;
import java.util.List;

import com.afpa.learning.dao.SubjectDAOImp;
import com.afpa.learning.model.Subject;

public class SubjectServiceImp implements ISubjectService{
	
	private SubjectDAOImp subjectDaoImp = new SubjectDAOImp();

	@Override
	public List<Subject> index() {
		return subjectDaoImp.getSubject();
	}

	@Override
	public Subject create(String pName, String pState, Date pStudyDate) {
		Subject vSubject = new Subject(pName, pState, pStudyDate);
		return subjectDaoImp.addSubject(vSubject);
	}

	@Override
	public Subject read(int pId) {
		return subjectDaoImp.showSubjectById(pId);
	}

	@Override
	public Subject update(int pId, String pName, String pState, Date pStudyDate) {
		Subject vSubject = new Subject(pId, pName, pState, pStudyDate);
		return subjectDaoImp.updateSubjectById(vSubject);
	}

	@Override
	public void delete(int pId) {
		subjectDaoImp.deleteSubjectById(pId);
	}

}
