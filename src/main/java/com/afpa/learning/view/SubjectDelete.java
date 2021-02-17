package com.afpa.learning.view;

import static com.afpa.learning.view.SubjectIhm.IHM_INS;

import com.afpa.learning.service.SubjectServiceImp;

public class SubjectDelete extends Action {

	protected SubjectServiceImp subjectServiceImp = new SubjectServiceImp();
	
	private static final int ID = 5;
	private static final String DESCRIPTION = "Delete a subject";
	
	SubjectDelete() {
		super(ID, DESCRIPTION);
	}
	
	@Override
	public boolean execute() {
		IHM_INS.display("Please enter the subject id to delete :");
		int vId = IHM_INS.intReader();

		subjectServiceImp.delete(vId);
		IHM_INS.display("The subject having for id : " + vId + " has been deleted");
		return Boolean.TRUE;
	}

}
