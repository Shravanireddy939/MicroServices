package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Customer1Dao;



@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	Customer1Dao cus1Dao;

	@Override
	public void addAmount(Integer cusId, Double balance) {
		// TODO Auto-generated method stub
		Double b= cus1Dao.getAmount(cusId) ;
		Double c= b+balance;
		Integer d= cus1Dao.updateAmount(cusId, c) ;
		 return ;
	}



}