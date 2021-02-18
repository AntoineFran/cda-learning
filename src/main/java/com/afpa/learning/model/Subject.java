package com.afpa.learning.model;

import java.sql.Date;

public class Subject {
	private int id;
	private String title;
	private String state;
	private Date studyDate;

	public Subject() {}

	public Subject(String pTitle, String pState, Date pStudyDate) {
		this.title = pTitle;
		this.state = pState;
		this.studyDate = pStudyDate;
	}
	
	public Subject(int pId, String pTitle, String pState, Date pStudyDate) {
		this.id = pId;
		this.title = pTitle;
		this.state = pState;
		this.studyDate = pStudyDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String pTitle) {
		this.title = pTitle;
	}

	public String getState() {
		return state;
	}

	public void setState(String pState) {
		this.state = pState;
	}

	public Date getStudyDate() {
		return studyDate;
	}

	public void setStudyDate(Date pStudyDate) {
		this.studyDate = pStudyDate;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", title=" + title + ", state=" + state + ", studyDate=" + studyDate + "]";
	}	
	

}
