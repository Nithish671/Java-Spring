package com.example;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

public class EmpDao {
	private JdbcTemplate temp;
	
	public EmpDao(DataSource ds) {
		this.temp = new JdbcTemplate(ds);
	}
	
	public void update(String name, int id) {
		String query = "UPDATE employee SET name = ? WHERE id = ?";
		
		temp.update(query, name, id);
		System.out.println("\nUpdated Employee Details : " + id + " . " + name);
	}
	
	public List<Employee> listEmployees() {
		String query = "SELECT * FROM employee";
		
		List<Employee> empList = temp.query(query, new EmployeeMapper());
		
		return empList;
	}
}
