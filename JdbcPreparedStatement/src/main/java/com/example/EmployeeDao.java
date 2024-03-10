package com.example;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmployeeDao {
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	} 
	
	public void saveEmployee(final Employee e) {
		String query = "INSERT INTO employee(name, salary) VALUES(?, ?)";
		    jt.execute(query, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setString(1, e.getName());
				ps.setFloat(2, e.getSalary());
				
				return ps.execute();
			}
		}
);
		    System.out.println("\nCreated Employee Details : \nName : " + e.getName() + "\nSalary : " + e.getSalary());
	} 
}
