package com.afpa.learning.view;

import static com.afpa.learning.view.SubjectIhm.IHM_INS;

public class SubjectShow extends Action {

	private static final int ID = 3;
	private static final String DESCRIPTION = "Show a subject";
	
	SubjectShow() {
		super(ID, DESCRIPTION);
	}
	
	@Override
	public boolean execute() {
		
		IHM_INS.display("");
		return Boolean.TRUE;
	}

}
