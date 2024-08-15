package com.pratham.MyAccountOperation;

import com.pratham.MyAccountOperation.entities.Account;
import com.pratham.MyAccountOperation.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BankController {
	
	@Autowired
	private AccountServices accServ;
	
	@GetMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	@PostMapping("/addacc")
	public ModelAndView addAccount(Account obj)
	{
		System.out.println(obj);
		String stat=accServ.addNewAccount(obj);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("NewAccountStatus.jsp");
		mv.addObject("status",stat);
		return mv;
	}
	
	@GetMapping("/showacc")
	public ModelAndView showReport()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("AccountReport.jsp");
		
		List<Account> list=accServ.getAllAccounts();
		mv.addObject("acclist",list);
		return mv;
	}
	
	@GetMapping("/search")
	public String search()
	{
		return "Search.html";
	}

	@PostMapping("/searchacc")
	public ModelAndView searchAcc(int accno)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("SearchResult.jsp");
		Account obj=accServ.searchAccountNumber(accno);
		mv.addObject("acc",obj);
		return mv;
	}

	@GetMapping("/deposite")
	public String deposite()
	{
		return "Deposite.html";
	}

	@PostMapping("/depositeamt")
	public ModelAndView depositeAmt(int accno, float amount)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("DepositeStatus.jsp");
		String stat= accServ.depositeAmount(accno, amount);
		mv.addObject("status",stat);
		return mv;
	}
}
