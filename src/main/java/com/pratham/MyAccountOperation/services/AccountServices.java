package com.pratham.MyAccountOperation.services;

import com.pratham.MyAccountOperation.entities.Account;
import com.pratham.MyAccountOperation.repositories.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServices {
	
	@Autowired
	private AccountsRepository accRepo;

	public String addNewAccount(Account obj)
	{
		String status="";
		try
		{
			accRepo.save(obj);
			status="success";
		}
		catch(Exception e)
		{
			status="failed";
		}
		return status;
	}
	
	public List<Account> getAllAccounts()
	{
		List<Account> list=accRepo.findAll();
		return list;
	}
	
	public Account searchAccountNumber(int ano)
	{
		Account obj=accRepo.findByAccno(ano);
		return obj;
	}

	public String depositeAmount(int accno, float amount)
	{
		String status="";
		try {
			Account obj = accRepo.findByAccno(accno);
			System.out.println(obj);
			obj.setBalance(obj.getBalance() + amount);
			System.out.println(obj);
			accRepo.save(obj);
			status = "success";
		}catch(Exception e)
		{
			status="failed";
		}
		return status;
	}
}