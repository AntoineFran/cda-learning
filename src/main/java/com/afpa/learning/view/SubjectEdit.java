package com.afpa.learning.view;

import static com.afpa.learning.view.SubjectIhm.IHM_INS;

import java.sql.Date;

import com.afpa.learning.service.SubjectServiceImp;

public class SubjectEdit extends Action {

	protected SubjectServiceImp subjectServiceImp = new SubjectServiceImp();
	
	private static final int ID = 4;
	private static final String DESCRIPTION = "Modify a subject";
	
	SubjectEdit() {
		super(ID, DESCRIPTION);
	}
	
	@Override
	public boolean execute() {
		IHM_INS.display("Please enter the subject id :");
		int vId = IHM_INS.intReader();

		IHM_INS.display("Please enter the subject title :");
		String vTitle = IHM_INS.stringReader();

		IHM_INS.display("Please choose between these states, which one describe the most your knowledge about this subject  and write it :  \n"
						+ "     - Unknown \n" + "     - Discovered \n" + "     - Understood");
		String vState = IHM_INS.stringReader();

		IHM_INS.display(
				"Please enter the date (in this format : 'YYYY-MM-DD') of the first time you studied this subject, if not studied yet just press enter :");
		String dateStr = IHM_INS.stringReader();
		
		Date vDate;
		if (dateStr.matches("\\d{4}-\\d{2}-\\d{2}")) {
			vDate = Date.valueOf(dateStr);
		}else {
			vDate = null;
		}
		
		IHM_INS.display(subjectServiceImp.update(vId, vTitle, vState, vDate).toString());
		return Boolean.TRUE;
	}

}
