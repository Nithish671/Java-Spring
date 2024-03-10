package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		emp.setSalary(rs.getFloat("salary"));
		
		return emp;
	}
}
