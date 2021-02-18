package com.afpa.learning.view;

import static com.afpa.learning.view.SubjectIhm.IHM_INS;

import com.afpa.learning.service.SubjectServiceImp;

public class SubjectShow extends Action {

	protected SubjectServiceImp subjectServiceImp = new SubjectServiceImp();

	private static final int ID = 3;
	private static final String DESCRIPTION = "Show a subject";

	public SubjectShow() {
		super(ID, DESCRIPTION);
	}

	@Override
	public boolean execute() {
		IHM_INS.display("Please enter the subject id :");
		int vId = IHM_INS.intReader();

		IHM_INS.display(subjectServiceImp.read(vId).toString());
		return Boolean.TRUE;
	}

}
