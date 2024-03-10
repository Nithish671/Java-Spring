package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDao {
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	} 
	
	public List<Employee> listEmployees() {
		return jt.query("SELECT * FROM employee", new ResultSetExtractor<List<Employee>>() {
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException {
				List<Employee> list = new ArrayList<Employee>();
				
				while(rs.next()) {
					Employee e = new Employee();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setSalary(rs.getFloat(3));
					list.add(e);
				}
				return list;
			}
		});
	}
}
