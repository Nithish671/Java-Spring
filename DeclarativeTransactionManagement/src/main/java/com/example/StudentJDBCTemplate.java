package com.example;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDao {
	private JdbcTemplate jt;
	
	public void setDs(DataSource ds) {
		this.jt = new JdbcTemplate(ds);
	}
	
	public void create(String fname, String lname, Integer age, Integer marks, Integer year) {
		try {
			String sql1 = "INSERT INTO student(fname, lname, age) VALUES(?, ?, ?)";
			jt.update(sql1, fname, lname, age);
			
			String sql2 = "SELECT MAX(id) FROM student";
			int sid = jt.queryForObject(sql2, int.class);
			
			String sql3 = "INSERT INTO marks(sid, marks, year) VALUES(?, ?, ?)";
			jt.update(sql3, sid, marks, year);
			
			System.out.println("Record Created : \n" + "Name : " + fname + " " + lname + "\n"
					+ "Age : " + age + "\n"
							+ "Marks : " + marks + "\n"
									+ "Year : " + year);
			
		} catch(DataAccessException e) {
			System.out.println("Error in creating record, Rollback!");
			throw e;
		}
	}
	
	public List<Student> listStudents() {
		String sql = "SELECT * FROM student, marks WHERE student.id = marks.sid";
		List<Student> student = jt.query(sql, new StudentMapper());
		
		return student;
	}
	
}
