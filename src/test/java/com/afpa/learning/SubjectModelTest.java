package com.afpa.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import com.afpa.learning.model.Subject;


public class SubjectModelTest {

	static Subject subject;
	
	//Test builders
	
	@Test
	void test_builder_without_param() {
		subject = new Subject();
		assertEquals(Subject.class,subject.getClass());	
	}
	
	@Test
	void test_builder_with_title_state_date() {
		subject = new Subject("Socket","Unknown",new Date(2020-02-18));
		assertEquals(Subject.class,subject.getClass());	
	}
	
	@Test
	void test_builder_with_id_title_state_date() {
		subject = new Subject(1,"Socket","Unknown",new Date(2020-02-18));
		assertEquals(Subject.class,subject.getClass());	
	}
	
	//Tests getters
	
	@Test
	void test_get_id() {
		subject = new Subject(1,"Socket","Unknown",new Date(2020-02-18));
		assertEquals(1, subject.getId());
	}
	
	@Test
	void test_get_title() {
		subject = new Subject("Socket","Unknown",new Date(2020-02-18));
		assertEquals("Socket", subject.getTitle());
	}
	
	@Test
	void test_get_state() {
		subject = new Subject("Socket","Unknown",new Date(2020-02-18));
		assertEquals("Unknown", subject.getState());
	}
	
	@Test
	void test_get_date() {
		subject = new Subject("Socket","Unknown",new Date(2020-02-18));
		assertEquals(new Date(2020-02-18), subject.getStudyDate());
	}
	
	
	//Tests Setters
	
	void test_set_title() {
		subject = new Subject("Socket","Unknown",new Date(2020-02-18));
		subject.setTitle("POO");
	    assertEquals("POO", subject.getTitle());
	}
	
	void test_set_state() {
		subject = new Subject("Socket","Unknown",new Date(2020-02-18));
		subject.setState("Understood");
	    assertEquals("Understood", subject.getState());
	}
	
	void test_set_date() {
		subject = new Subject("Socket","Unknown",new Date(2020-02-18));
		subject.setStudyDate(new Date(2020-02-19));
	    assertEquals(new Date(2020-02-19), subject.getStudyDate());
	}
	
	
}
