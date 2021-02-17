package com.afpa.learning.service;

import java.sql.Date;
import java.util.List;

import com.afpa.learning.model.Subject;

public interface ISubjectService {
	
	// Subjects list
	public List<Subject> index();
	
	// Create Subject
	public Subject create(String pName, String pState, Date pStudyDate);
	
	// Read Subject
	public Subject read(int pId);
	
	// Update Subject
	public Subject update(int pId, String pName, String pState, Date pStudyDate);
	
	// Delete Subject
	public void delete(int pId);
}
