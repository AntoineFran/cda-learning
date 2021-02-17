package com.afpa.learning.dao;

import java.util.List;

import com.afpa.learning.model.Subject;

public interface ISubjectDAO {

	// Subjects list
	public List<Subject> getSubject();
	
	// Create Subject
	public Subject addSubject(Subject pSubject);
	
	// Read Subject
	public Subject showSubjectById(int pId);
	
	// Update SubjectS
	public Subject updateSubjectById(Subject pSubject);
	
	// Delete Subject
	public void deleteSubjectById(int pId);
	
}