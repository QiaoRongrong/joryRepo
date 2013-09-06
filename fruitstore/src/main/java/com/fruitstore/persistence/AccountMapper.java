package com.fruitstore.persistence;

import com.fruitstore.domain.Account;
/**
 * It is come from mybatis JPet Store as a code sample.
 * @author Jory 
 *
 */
public interface AccountMapper {

  Account getAccountByUsername(String username);

  Account getAccountByUsernameAndPassword(Account account);

  void insertAccount(Account account);
  
  void insertSignon(Account account);
  
  /*    void insertProfile(Account account);
  

  void updateAccount(Account account);

  void updateProfile(Account account);

  void updateSignon(Account account);
*/
}
