package com.example;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentJDBCTemplate implements StudentDao {
	private DataSource ds;
	private JdbcTemplate jto;
	private PlatformTransactionManager ptm;
	
	public void setDs(DataSource ds) {
		this.ds = ds;
		this.jto = new JdbcTemplate(ds);
	}
	
	public void setPtm(PlatformTransactionManager ptm) {
		this.ptm = ptm;
	}
	
	public void create(String fname, String lname, Integer age, Integer marks, Integer year) {
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = ptm.getTransaction(def);
		
		try {
			String Sql1 = "INSERT INTO student(fname, lname, age) VALUES (?, ?, ?)";
			jto.update(Sql1, fname, lname, age);
			
			String Sql2 = "SELECT MAX(id) FROM student";
			int sid = jto.queryForObject(Sql2, Integer.class);
			
			String Sql3 = "INSERT INTO marks(sid, marks, year) VALUES (?, ?, ?)";
			jto.update(Sql3, sid, marks, year);
			
			System.out.println("Created Record : \n"
					+ "Name : " + fname + " " + lname + "\n"
							+ "Age : " + age + "\n"
									+ "Marks : " + marks + "\n"
											+ "Year : " + year + "\n");
			ptm.commit(status);
		} catch(DataAccessException e) {
			System.out.println("Error in creating, rolling back!");
			ptm.rollback(status);
			throw e;
		}
		return;
	}
	
	public List<Student> listStudents() {
		String Sql = "SELECT * FROM student, marks WHERE student.id = marks.sid";
		List<Student> student = jto.query(Sql, new StudentMarksMapper());
		
		return student;
	}

}
