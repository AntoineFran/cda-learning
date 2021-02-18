package com.afpa.learning.view;

import static com.afpa.learning.view.SubjectIhm.IHM_INS;

import java.util.List;

import com.afpa.learning.model.Subject;
import com.afpa.learning.service.SubjectServiceImp;

public class SubjectIndex extends Action {

	protected SubjectServiceImp subjectServiceImp = new SubjectServiceImp();
	
	private static final int ID = 1;
	private static final String DESCRIPTION = "List the subjects";
	
	public SubjectIndex() {
		super(ID, DESCRIPTION);
	}
	
	@Override
	public boolean execute() {
		IHM_INS.display("These are the different subjects :");
		List<Subject> subjects = subjectServiceImp.index();
		
		for (Subject subject : subjects) {			
			IHM_INS.display("     - " + subject);
		}
		return Boolean.TRUE;
	}

}
