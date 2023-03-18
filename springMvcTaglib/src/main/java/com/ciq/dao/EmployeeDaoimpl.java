package com.ciq.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ciq.Queries.Queries;
import com.ciq.pojo.Employee;
@Repository
public class EmployeeDaoimpl implements EmployeeDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public int save(Employee e) {
		int insert = jdbcTemplate.update(Queries.insert,new Object[]{e.getId(),e.getName(),e.getDes(),e.getSalary()});
		System.out.println(insert);
		return insert;
		
	}

	@Override
	public int update(Employee e) {
		int update = jdbcTemplate.update(Queries.update,new Object[] {e.getName(),e.getDes(),e.getSalary(),e.getId()});
		return update;
	}

	@Override
	public int delete(Integer id) {
		int d = jdbcTemplate.update(Queries.delete,new Object[] {id});
		return d;
	}

	@Override
	public List<Employee> GetAll() {
		List<Employee>list=jdbcTemplate.query(Queries.GetAll, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e=new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setDes(rs.getString(3));
				e.setSalary(rs.getDouble(4));
				return e;
			}
			
		});
		
		return list;
	}

	@Override
	public Employee findbyid(Integer id) {
	Employee e = jdbcTemplate.queryForObject(Queries.findbyid,new Object[]{id},BeanPropertyRowMapper.newInstance(Employee.class));
		return e;
	}
	
	

}
