package com.example.demo.ifaces;
import java.util.*;

import com.example.demo.model.Customer;

public interface CrudRespository<T>{
		public boolean save(T t);
		public List<Customer> findAll();
}
