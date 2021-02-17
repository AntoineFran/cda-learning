package com.afpa.learning.view;

public abstract class Action {

	protected final int id;
	protected final String description;
	
	protected Action(int pId, String pDescription) {
		this.id = pId;
		this.description = pDescription;
	}
	
	public abstract boolean execute();

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
}
