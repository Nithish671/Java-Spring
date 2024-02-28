package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentMarksMapper implements RowMapper<Student> {
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		
		student.setId(rs.getInt("id"));
		student.setFname(rs.getString("fname"));
		student.setLname(rs.getString("lname"));
		student.setAge(rs.getInt("age"));
		student.setSid(rs.getInt("sid"));
		student.setMarks(rs.getInt("marks"));
		student.setYear(rs.getInt("year"));
		
		return student;
	}
}
