package com.example.WebBanSach.services;

import com.example.WebBanSach.entity.Account;
import com.example.WebBanSach.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private IAccountRepository accountRepository;
    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    public Account getAccountById(Long Id){
        return accountRepository.findById(Id).orElse(null);
    }
    public void addAccount(Account account){
        accountRepository.save(account);
    }
    public void deleteAccount(Long id){
        accountRepository.deleteById(id);
    }
    public void updateAccount(Account account){
        accountRepository.save(account);
    }
}
