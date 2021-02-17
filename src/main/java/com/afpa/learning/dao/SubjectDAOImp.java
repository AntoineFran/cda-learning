package com.afpa.learning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.afpa.learning.connection.DatabaseConnection;
import com.afpa.learning.model.Subject;

public class SubjectDAOImp implements ISubjectDAO {

	protected static Connection connection = DatabaseConnection.getConnection();
	protected PreparedStatement ps;
	protected Statement statement;
	protected ResultSet result;
	protected String request;

	@Override
	public List<Subject> getSubject() {
		List<Subject> vSubjects = new ArrayList<>();
		request = "select * FROM subject;";

		try {
			statement = connection.createStatement();
			result = statement.executeQuery(request);
			while (result.next()) {
				Subject vSubject = new Subject(
						result.getInt("id_subject"),
						result.getString("title_subject"),
						result.getString("state"), 
						result.getDate("study_date"));
				vSubjects.add(vSubject);
			}
		} catch (SQLException e) {
			return null;
		}

		return vSubjects;
	}

	@Override
	public Subject addSubject(Subject pSubject) {
		request = "INSERT INTO subject(title_subject,state,study_date) VALUES(?,?,?);";
		try {
			ps = connection.prepareStatement(request, PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, pSubject.getTitle());
			ps.setString(2, pSubject.getState());
			ps.setDate(3, pSubject.getStudyDate());
			ps.executeUpdate();
		} catch (SQLException e) {
			return null;
		}

		return pSubject;
	}

	@Override
	public Subject showSubjectById(int pId) {
		Subject vSubject = null;
		request = "select * FROM subject WHERE id_subject = ?";

		try {
			ps = connection.prepareStatement(request);
			ps.setInt(1, pId);
			result = ps.executeQuery();
			result.next();
			vSubject = new Subject(
					result.getInt("id_subject"),
					result.getString("title_subject"),
					result.getString("state"), 
					result.getDate("study_date"));	
		} catch (SQLException e) {
			
		}
		
		return vSubject;
	}

	@Override
	public Subject updateSubjectById(Subject pSubject) {
		request = "UPDATE subject SET title_subject = ?,"
				+ " state = ?,"
				+ " study_date = ?"
				+ " WHERE id_subject = ?;";
		try {
			ps = connection.prepareStatement(request, PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, pSubject.getTitle());
			ps.setString(2, pSubject.getState());
			ps.setDate(3, pSubject.getStudyDate());
			ps.setInt(4, pSubject.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			return null;
		}
		
		return pSubject;
	}

	@Override
	public boolean deleteSubjectById(int pId) {
		request = "DELETE FROM subject WHERE id_subject = ?;";
		try {
			ps = connection.prepareStatement(request);
			ps.setInt(1, pId);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
