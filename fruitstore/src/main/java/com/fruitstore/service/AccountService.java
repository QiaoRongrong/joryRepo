package com.fruitstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fruitstore.domain.Account;
import com.fruitstore.persistence.AccountMapper;

@Service
public class AccountService {

  @Autowired
  private AccountMapper accountMapper;

  public Account getAccount(String username) {
    return accountMapper.getAccountByUsername(username);
  }

  
  public Account getAccount(String username, String password) {
    Account account = new Account();
    account.setUsername(username);
    account.setPassword(password);
    return accountMapper.getAccountByUsernameAndPassword(account);
  }

  @Transactional 
  public void insertAccount(Account account){
    accountMapper.insertAccount(account);
    accountMapper.insertSignon(account);
  }

  /*
  @Transactional
  public void updateAccount(Account account) {
    accountMapper.updateAccount(account);
    accountMapper.updateProfile(account);

    if (account.getPassword() != null && account.getPassword().length() > 0) {
      accountMapper.updateSignon(account);
    }
  }
*/
}
