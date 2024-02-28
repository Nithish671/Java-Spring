package com.example;

import java.util.List;
import javax.sql.DataSource;

public interface StudentDao {
	public void setDs(DataSource ds);
	
	public void create(String fname, String lname, Integer age, Integer marks, Integer year);
	
	public List<Student> listStudents();
}
