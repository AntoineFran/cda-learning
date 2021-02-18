package com.afpa.learning;

import org.junit.jupiter.api.Test;

import com.afpa.learning.view.Exit;
import com.afpa.learning.view.SubjectDelete;
import com.afpa.learning.view.SubjectEdit;
import com.afpa.learning.view.SubjectIndex;
import com.afpa.learning.view.SubjectNew;
import com.afpa.learning.view.SubjectShow;

import static org.junit.jupiter.api.Assertions.*;


public class SubjectViewTest {

	@Test
	void subjectEdit_builder() {
	SubjectEdit subject = new SubjectEdit();
	assertEquals(SubjectEdit.class,subject.getClass());
	}	
	
	@Test
	void subjectIndex_builder() {
	SubjectIndex subject = new SubjectIndex();
	assertEquals(SubjectIndex.class,subject.getClass());
	}
	
	@Test
	void subjectDelete_builder() {
	SubjectDelete subject = new SubjectDelete();
	assertEquals(SubjectDelete.class,subject.getClass());
	}
	
	@Test
	void subjectNew_builder() {
	SubjectNew subject = new SubjectNew();
	assertEquals(SubjectNew.class,subject.getClass());
	}
	
	@Test
	void subjectShow_builder() {
	SubjectShow subject = new SubjectShow();
	assertEquals(SubjectShow.class,subject.getClass());
	}
	
	@Test
	void subjectExit_builder() {
	Exit exit = new Exit();
	assertEquals(Exit.class,exit.getClass());
	assertFalse(exit.execute());
	}
	

}
