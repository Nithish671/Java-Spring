package com.example;

import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class EmployeeDao {
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public void saveEmployee(Employee e) {
		String query = "INSERT INTO employee(name, salary) VALUES('" + e.getName() + "', '" + e.getSalary() + "')";
		jt.update(query);
		System.out.println("\nInserted Employee : \n" + "Name : " + e.getName() + "\n"
				+ "Salary : " + e.getSalary());
	}
	
	public void updateEmployee(Employee e) {
		String query = "UPDATE employee SET name = '" + e.getName() + "', salary = '"+ e.getSalary() + "' WHERE id = '" + e.getId() + "'";
		jt.update(query);
		System.out.println("\nUpdated Employee Details : \n" + "Name : " + e.getName() + "\n"
				+ "Salary : " + e.getSalary() + "\n");
	}
	
	public void deleteEmployee(Employee e) {
		String query = "DELETE FROM employee WHERE name = '" + e.getName() + "'";
		jt.update(query);
		System.out.println("Employee " + e.getName() + " Details has been deleted!");
	} 
	
	public List<Employee> listEmployee() {
		String query = "SELECT * FROM employee";
		List<Employee> emp = jt.query(query, new EmployeeMapper());
		return emp;
	}
}
