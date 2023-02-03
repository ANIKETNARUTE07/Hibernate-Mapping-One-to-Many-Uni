package com.jsp.person.bankaccount;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bank_name;
	private String ifsc;
	private long Acc_no;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getifsc() {
		return ifsc;
	}
	public void setifsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public long getAcc_no() {
		return Acc_no;
	}
	public void setAcc_no(long Acc_no) {
		this.Acc_no = Acc_no;
	}
	
	
	

}
