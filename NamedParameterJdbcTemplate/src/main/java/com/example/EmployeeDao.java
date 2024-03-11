package com.example;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import java.util.*;

public class EmployeeDao {
	NamedParameterJdbcTemplate temp;
	
	public EmployeeDao(NamedParameterJdbcTemplate temp) {
		this.temp = temp;
	}
	
	public void save(Employee e) {
		String query = "INSERT INTO employee(name, salary) VALUES (:name, :salary)";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", e.getName());
		map.put("salary", e.getSalary());
		
		temp.execute(query, map, new PreparedStatementCallback() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});
		System.out.println("\nInserted Employee : \n"
				+ "Name : " + e.getName() + "\n"
						+ "Salary : " + e.getSalary());
	}
}
