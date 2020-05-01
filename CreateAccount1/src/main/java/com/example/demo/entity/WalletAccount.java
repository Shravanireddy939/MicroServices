package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="WalletAccount")

public class WalletAccount implements Serializable{

	private static final long serialVersionUID = 1L;
		
	
@Id
@GeneratedValue
@Column(length=10)
private Integer account_Id;
@Column(length=10)
private Double account_Balance;
@Column(length=10)
private Enum status;


@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="user_Id")
private WalletAccount walletaccount;



@OneToMany (targetEntity=WalletTransactions.class, cascade = CascadeType.ALL)
@JoinColumn	(name = "account_Id" , referencedColumnName = "account_Id")
private List<WalletTransactions> wallettransactions;



public WalletAccount getWalletaccount() {
	return walletaccount;
}
public void setWalletaccount(WalletAccount walletaccount) {
	this.walletaccount = walletaccount;
}

public Integer getAccount_Id() {
	return account_Id;
}
public void setAccount_Id(Integer account_Id) {
	this.account_Id = account_Id;
}
public Double getAccount_Balance() {
	return account_Balance;
}
public void setAccount_Balance(Double account_Balance) {
	this.account_Balance = account_Balance;
}
public Enum getStatus() {
	return status;
}
public void setStatus(Enum status) {
	this.status = status;
}
public List<WalletTransactions> getWallettransactions() {
	return wallettransactions;
}
public void setWallettransactions(List<WalletTransactions> wallettransactions) {
	this.wallettransactions = wallettransactions;
}

/*public void addWalletTransactions(WalletTransactions wallettransactions) {
	wallettransactions.setWalletaccount(this);			//this will avoid nested cascade
	this.getWallettransactions().add(wallettransactions);

}*/


/*public void addEmployee(Employee employee) {
	employee.setDepartment(this);			//this will avoid nested cascade
	this.getEmployees().add(employee);
}*/
}