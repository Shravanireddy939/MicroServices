package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Customer1Dao;



@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired

	Customer1Dao cus1Dao;


	@SuppressWarnings("unused")
	@Override
	public void transferAmount(Double amount, Integer cusId1, Integer cusId2) {
		// TODO Auto-generated method stub
	
		Double j= cus1Dao.getAmount1(cusId1) ;
		Double h= j-amount;
		 Integer i= cus1Dao.updateAmount1(cusId1, h) ;
		 
	     Double b= cus1Dao.getAmount2(cusId2) ;
			Double c= b+amount;
			 Integer d= cus1Dao.updateAmount2(cusId2, c) ;
			 
				  return;
	}

	


}