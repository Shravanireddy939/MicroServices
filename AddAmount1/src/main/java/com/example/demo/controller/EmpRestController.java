package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.WalletAccount;
import com.example.demo.service.CustomerService;



@RestController
@RequestMapping("/Wallet")
@CrossOrigin("http://localhost:4200")
public class EmpRestController {

@Autowired
CustomerService cusService;

@PutMapping("/addamount/{cusId}/{balance}")
public String addAmount(@PathVariable Integer cusId, @PathVariable Double balance) {
	 Double c=cusService.addAmount(cusId, balance);
	 
	 cusService.fetchData(cusId);
	 
	 return "Amount added successfully to UserId: "+ cusId+"  present balance: "+c;

}


}
