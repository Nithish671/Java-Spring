package com.example;

import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class StudentJDBCTemplate implements StudentDao {
	private DataSource dataSource;
	private SimpleJdbcCall jdbcCall;
	private JdbcTemplate jto;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
		this.jto = new JdbcTemplate(dataSource);
	}
	
	public void create(String fname, String lname, Integer age) {
		String SQL = "INSERT INTO student (fname, lname, age) VALUES (?, ?, ?)";
		
		jto.update(SQL, fname, lname, age);
		System.out.println("Created Record Name : " + fname + " " + lname + "\nAge : " + age);
		return;
	}
	
	public Student getStudent(Integer id) {
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
		Map<String, Object> out = jdbcCall.execute(in);
		
		Student student = new Student();
		
		student.setId(id);
		student.setFname((String) out.get("out_fname"));
		student.setLname((String) out.get("out_lname"));
		student.setAge((Integer) out.get("out_age"));
		
		return student;
	}
	
	public List<Student> listStudents() {
		String SQL = "SELECT * FROM student";
		List<Student> students = jto.query(SQL, new StudentMapper());
		return students;
	}
	
}
