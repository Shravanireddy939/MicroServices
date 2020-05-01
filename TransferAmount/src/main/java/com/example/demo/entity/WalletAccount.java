package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="WalletAccount")

public class WalletAccount implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(length=10)	
	private Integer user_Id;
	
	
@Id
//@GeneratedValue(strategy=GenerationType.AUTO)
@Column(length=10)
private Integer account_Id;
@Column(length=10)
private Double account_Balance;
@Column(length=10)
private Enum status;


@OneToMany(mappedBy="account_Id",cascade=CascadeType.ALL)
@Column(length=10)
private List<WalletTransactions> wallettransactions;



public Integer getUser_Id() {
	return user_Id;
}
public void setUser_Id(Integer user_Id) {
	this.user_Id = user_Id;
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