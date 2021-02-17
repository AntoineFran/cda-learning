package com.afpa.learning.view;

import java.util.TreeMap;


public class TheActions {
	private static TreeMap<Integer, Action> actions = new TreeMap<>();
	
	public final static Exit EXIT = new Exit();
	public final static SubjectIndex SUBJECTINDEX = new SubjectIndex();
	public final static SubjectNew SUBJECTNEW = new SubjectNew();
	public final static SubjectShow SUBJECTSHOW = new SubjectShow();
	public final static SubjectEdit SUBJECTEDIT = new SubjectEdit();
	public final static SubjectDelete SUBJECTDELETE = new SubjectDelete();
	
	public static TreeMap<Integer, Action> addAllActions() {
		addAction(actions, EXIT);
		addAction(actions, SUBJECTINDEX);
		addAction(actions, SUBJECTNEW);
		addAction(actions, SUBJECTSHOW);
		addAction(actions, SUBJECTEDIT);
		addAction(actions, SUBJECTDELETE);
		return actions;
	}
	
	private static void addAction(TreeMap<Integer, Action> actions, Action pAction) {
		actions.put(pAction.getId(), pAction);
	}

	public static TreeMap<Integer, Action> getActions() {
		return actions;
	}
		
}
