package com.afpa.learning.view;

import static com.afpa.learning.view.SubjectIhm.IHM_INS;

public class SubjectIndex extends Action {

	private static final int ID = 1;
	private static final String DESCRIPTION = "List the subjects";
	
	SubjectIndex() {
		super(ID, DESCRIPTION);
	}
	
	@Override
	public boolean execute() {
		
		IHM_INS.display("");
		return Boolean.TRUE;
	}

}
