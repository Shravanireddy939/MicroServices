package com.example.demo.service;

import com.example.demo.entity.WalletTransactions;

public interface CustomerService {



	void transferAmount(Double amount, Integer cusId1, Integer cusId2);

	//void fetchData1(Double amount, Integer cusId1);

	//void fetchData12(Double amount, Integer cusId2);

}
