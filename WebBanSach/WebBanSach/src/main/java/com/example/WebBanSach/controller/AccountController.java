package com.example.WebBanSach.controller;

import com.example.WebBanSach.entity.Account;
import com.example.WebBanSach.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;
    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("")
    public String showAllAccount(Model model){
        List<Account> accounts = accountService.getAllAccounts();
        model.addAttribute("accounts",accounts);
        return "account/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("account", new Account());
        return "/account/createAccount";
    }

    @PostMapping("/create")
    public String createAccount(@ModelAttribute("account") Account account) {
        accountService.addAccount(account);
        return "redirect:/account";
    }
}


