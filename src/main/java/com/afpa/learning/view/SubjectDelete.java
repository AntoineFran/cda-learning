package com.afpa.learning.view;

import static com.afpa.learning.view.SubjectIhm.IHM_INS;

public class SubjectDelete extends Action {

	private static final int ID = 5;
	private static final String DESCRIPTION = "Delete a subject";
	
	SubjectDelete() {
		super(ID, DESCRIPTION);
	}
	
	@Override
	public boolean execute() {
		
		IHM_INS.display("");
		return Boolean.TRUE;
	}

}
