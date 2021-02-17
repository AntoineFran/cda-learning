package com.afpa.learning.view;

import static com.afpa.learning.view.SubjectIhm.IHM_INS;

public class SubjectEdit extends Action {

	private static final int ID = 4;
	private static final String DESCRIPTION = "Modify a subject";
	
	SubjectEdit() {
		super(ID, DESCRIPTION);
	}
	
	@Override
	public boolean execute() {
		
		IHM_INS.display("");
		return Boolean.TRUE;
	}

}
