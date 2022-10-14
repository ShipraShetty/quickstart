package com.example.demo.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.ifaces.CrudRespository;
import com.example.demo.model.Customer;

@Repository
public class CustomerRepositoryImpl implements CrudRespository<Customer> {
	
	private JdbcTemplate template;
	
	@Autowired
	public CustomerRepositoryImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public boolean save(Customer t) {
		// TODO Auto-generated method stub
		String sql="insert into tieto_customerr values(?,?,?)";
		int rowAdded= template.update(sql,t.getCustomerId(),t.getCustomerName(),t.getEmail());
		return rowAdded==1?true:false;
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		String sql="select * from tieto_customerr";
		return template.query(sql, BeanPropertyRowMapper.newInstance(Customer.class));
	}
	

}
