package com.afpa.learning.view;

import static com.afpa.learning.view.SubjectIhm.IHM_INS;

public class SubjectNew extends Action {

	private static final int ID = 2;
	private static final String DESCRIPTION = "Create a subject";
	
	SubjectNew() {
		super(ID, DESCRIPTION);
	}
	
	@Override
	public boolean execute() {
		
		IHM_INS.display("");
		return Boolean.TRUE;
	}

}
