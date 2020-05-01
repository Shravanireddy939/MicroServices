package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.WalletAccount;


 
@Repository
public interface Customer1Dao  extends JpaRepository<WalletAccount, Integer> {
	

		
	@Query("select e.account_Balance from WalletAccount e where user_Id=?1")
	Double getAmount1(@Param("userid")Integer cusId2);

	@Modifying
	@Transactional
	@Query("update WalletAccount w set w.account_Balance = ?2 where user_Id=?1 ")
	Integer updateAmount1(@Param("userid")Integer cusId2, @Param("balance") Double h);

	@Query("select e.account_Balance from WalletAccount e where user_Id=?1")
	Double getAmount2(@Param("userid")Integer cusId1);

	@Modifying
	@Transactional
	@Query("update WalletAccount w set w.account_Balance = ?2 where user_Id=?1 ")
	Integer updateAmount2(@Param("userid")Integer cusId1, @Param("balance") Double c);


	

	}

