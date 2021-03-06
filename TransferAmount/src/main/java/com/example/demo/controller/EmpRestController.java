package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CustomerService;
import com.example.demo.entity.*;


@RestController
@RequestMapping("/Wallet")
@CrossOrigin("http://localhost:4200")
public class EmpRestController {

@Autowired
CustomerService cusService;

@PutMapping("/transferAmount/{amount}/{cusId1}/{cusId2}")
public String updateEmp(@PathVariable Double amount, @PathVariable Integer cusId1, @PathVariable Integer cusId2) {
       cusService.transferAmount(amount, cusId1, cusId2);
       
      // cusService.fetchData1(amount, cusId1);
      // cusService.fetchData12(amount, cusId2);      //to enter data in database
       
           return "Amount "+amount+" transfered successfully from account of UserId "+ cusId1+" to "+cusId2;
      
}
}
