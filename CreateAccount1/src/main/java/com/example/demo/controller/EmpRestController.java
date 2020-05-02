package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.WalletAccount;
import com.example.demo.entity.WalletUser;
import com.example.demo.service.CustomerService;


@RestController
@RequestMapping("/Wallet")
@CrossOrigin("http://localhost:4200")
public class EmpRestController {

@Autowired
CustomerService cusService;
@PostMapping("/CreateAccount")
public String CreateAccount(@RequestBody WalletAccount acc) {
	acc.setAccount_Balance(0.0);
	//acc.setStatus(EnumClass.NOBALANCE);  
	WalletAccount  c=cusService.createAccount(acc);
     System.out.println(c.getAccount_Id());
     //c.getAccount_Balance();
     //c.setAccount_Balance(0.0);
   // c.setStatus(EnumClass.NOBALANCE);                                         //to enter data in database
    
	return "Customer Account Created Successfully";
	}
}