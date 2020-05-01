package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="WalletTransactions")

public class WalletTransactions {
	
	
	@Column(length=10)
	private Integer account_Id;
	@Id
	//@GeneratedValue
	@Column(length=10)
	private Integer transaction_Id;
	@Column(length=10)
	private String description;
	@Column(length=10)
	private LocalDateTime date_Of_Transaction;
	@Column(length=10)
	private Double amount;
	@Column(length=10)
	private Double account_Balance;
	
	/*@ManyToOne
	@JoinColumn(name="account_Id")
	private WalletAccount walletaccount;*/
	

	public Integer getAccount_Id() {
		return account_Id;
	}
	public void setAccount_Id(Integer account_Id) {
		this.account_Id = account_Id;
	}
	public Integer getTransaction_Id() {
		return transaction_Id;
	}
	public void setTransaction_Id(Integer transaction_Id) {
		this.transaction_Id = transaction_Id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getDate_Of_Transaction() {
		return date_Of_Transaction;
	}
	public void setDate_Of_Transaction(LocalDateTime date_Of_Transaction) {
		this.date_Of_Transaction = date_Of_Transaction;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getAccount_Balance() {
		return account_Balance;
	}
	public void setAccount_Balance(Double account_Balance) {
		this.account_Balance = account_Balance;
	}

	
	/*public WalletAccount getWalletaccount() {
		return walletaccount;
	}
	public void setWalletaccount(WalletAccount walletaccount) {
		this.walletaccount = walletaccount;
	}*/
	
	
	
}
