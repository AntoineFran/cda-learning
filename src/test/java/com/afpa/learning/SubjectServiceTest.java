package com.afpa.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;

import org.h2.tools.RunScript;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.afpa.learning.connection.DatabaseConnection;
import com.afpa.learning.model.Subject;
import com.afpa.learning.service.SubjectServiceImp;

@TestMethodOrder(OrderAnnotation.class)
public class SubjectServiceTest {

	private static SubjectServiceImp subjectServiceImp;

	@BeforeAll
	static void init() throws Exception {
		subjectServiceImp = new SubjectServiceImp();
		Connection connection = DatabaseConnection.getConnection();
		RunScript.execute(connection, new FileReader(SubjectProgramTest.class.getResource("/script_ddl.sql").getFile()));
	}

	@Test
	@Order(1)
	public void index_and_read_service_test() {
		assertEquals(new ArrayList<Subject>(), subjectServiceImp.index());
		assertEquals(null, subjectServiceImp.read(1));
	}

	@Test
	@Order(2)
	public void read_update_service_test() {
		subjectServiceImp.create("JavaScript", "Understood", new Date(2020 - 06 - 01));
		subjectServiceImp.read(1);
		assertEquals(new Subject(1, "JavaScript", "Understood", new Date(2020 - 06 - 01)).toString(), subjectServiceImp.read(1).toString());
		assertEquals(subjectServiceImp.read(1).toString(), subjectServiceImp.update(1, "JavaScript", "Understood", new Date(2020 - 06 - 01)).toString());
	}

	@Test
	@Order(4)
	public void update_service_test() {
		subjectServiceImp.create("Java", "Unknown", new Date(2020 - 11 - 01));
		Subject subject = new Subject(1, "Java", "Unknown", new Date(2020 - 11 - 01));
		assertFalse(subject.toString().equalsIgnoreCase(subjectServiceImp.update(1, "JavaScript", "Understood", new Date(2020 - 06 - 01)).toString()));
		assertTrue(subjectServiceImp.read(1).toString().equalsIgnoreCase(subjectServiceImp.update(1, "JavaScript", "Understood", new Date(2020 - 06 - 01)).toString()));
	}

	@Test
	@Order(5)
	public void create_and_delete_service_test() {
		assertEquals(2, subjectServiceImp.index().size()); // 2 already created above
		subjectServiceImp.create("Java", "Unknown", new Date(2020 - 11 - 01));
		assertEquals(3, subjectServiceImp.index().size());
		subjectServiceImp.delete(2);
		assertEquals(2, subjectServiceImp.index().size());
	}
}
