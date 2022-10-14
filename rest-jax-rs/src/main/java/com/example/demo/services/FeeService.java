package com.example.demo.services;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Fee;
import com.example.demo.repos.FeeRepository;
public class FeeService {
    
	private FeeRepository repo=null;
	public FeeService() {
		super();
		// TODO Auto-generated constructor stub
		this.repo=new FeeRepository();
	}
    public Fee add(Fee entity) throws SQLException {
    	return this.repo.add(entity)==1?entity:null;
    }
    public List<Fee> findAll(){
    	return this.repo.findAll();
    }
    public Optional<Fee> findById(int key){
    	return this.repo.findById(key);
    }
    public int removeById(int key) {
    	return this.repo.remove(key);
    }
    public int updateById(int id,double amount) {
    	return this.repo.update(id,amount);
    }
}
