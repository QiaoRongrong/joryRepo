package com.fruitstore.persistence;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fruitstore.domain.Account;
import com.fruitstore.service.AccountService;

public class PersistenceTest {

	private static ApplicationContext context;
	private static AccountService accountService;

	@BeforeClass
	public static void beforeClass() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		assertNotNull(context);

		accountService = (AccountService)context.getBean("accountService");
		assertNotNull(accountService);
	}
	
	@Test
	public void testGetAccount(){
		Account account = accountService.getAccount("admin");
		System.out.println("account = " + account);
		assertNotNull(account);
		assertEquals("ABC", account.getFirstName());
	}
	
	@Test
	public void testAddAccount() {
		Account account = new Account("testUser2", "123456", "customer");
		account.setCity("Shanghai");
		
		accountService.insertAccount(account);
		
		Account account1 = accountService.getAccount("testUserTran");
		assertNull(account1);
	}
	
}
