package com.afpa.learning.view;

import static com.afpa.learning.view.SubjectIhm.IHM_INS;

public class Exit extends Action {

	private static final int ID = 0;
	private static final String DESCRIPTION = "Leave the program";
	
	Exit() {
		super(ID, DESCRIPTION);
	}
	
	@Override
	public boolean execute() {
		IHM_INS.display("Thank you for your visit");
		return false;
	}

}
