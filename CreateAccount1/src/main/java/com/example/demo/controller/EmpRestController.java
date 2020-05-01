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
@CrossOrigin("http://localhost:2020")
public class EmpRestController {

@Autowired
CustomerService cusService;
@PostMapping("/CreateAccount")
public String CreateAccount(@RequestBody WalletAccount acc) {
    cusService.createAccount(acc);
	return "Customer Account Created Successfully";
	}
}