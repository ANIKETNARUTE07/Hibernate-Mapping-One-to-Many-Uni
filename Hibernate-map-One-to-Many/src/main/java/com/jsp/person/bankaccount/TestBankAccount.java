package com.jsp.person.bankaccount;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestBankAccount {
	public static void main(String[] args) {
		

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("aniket");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		List<BankAccount> b1= new ArrayList();
		
		Person person = new Person();
		person.setName("aniket");
		person.setEmail("aniket@email.com");
		person.setCno(456971235);
		
		BankAccount bacc= new BankAccount();
	    bacc.setBank_name("SBI");
		bacc.setifsc("SBI123");
		bacc.setAcc_no(459854678);
	
		BankAccount bacc2= new BankAccount();
	    bacc2.setBank_name("SBI");
		bacc2.setifsc("SBI123");
		bacc2.setAcc_no(459854678);
		
		BankAccount bacc3= new BankAccount();
	    bacc3.setBank_name("SBI");
		bacc3.setifsc("SBI123");
		bacc3.setAcc_no(459854678);
		
		b1.add(bacc);
		b1.add(bacc2);
		b1.add(bacc3);
		
		person.setBank_account(b1);
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		
		entityManager.persist(bacc);
		entityManager.persist(bacc2);
		entityManager.persist(bacc3);
		entityTransaction.commit();
		System.out.println("all good");



		
		
		
		
		
		
	}

}
