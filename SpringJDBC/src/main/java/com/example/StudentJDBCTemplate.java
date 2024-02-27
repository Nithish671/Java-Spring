package com.example;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public void create(String fname, String lname, Integer age) {
		String SQL = "INSERT INTO animechar(firstName, lastName, age) VALUES (?, ?, ?)";
		jdbcTemplateObject.update(SQL, fname, lname, age);
		System.out.println("Created Record Name : " + fname + " " + lname + ", \nAge : " + age);
		return;
	}
	
	public Student getStudent(Integer id) {
		String SQL = "SELECT * FROM animechar WHERE id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL, new Object[] {id}, new StudentMapper());
		return student;
	}
	
	public List<Student> listStudents() {
		String SQL = "SELECT *  FROM animechar";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}
	
	public void delete(Integer id) {
		String SQL = "DELETE FROM animechar WHERE id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with Id : " + id);
		return;
	}
	
	public void update(Integer id, Integer age) {
		String SQL = "UPDATE animechar SET age = ? WHERE id = ?";
		jdbcTemplateObject.update(SQL, age, id);
		System.out.println("Updated Record with Id : " + id);
	}
}
