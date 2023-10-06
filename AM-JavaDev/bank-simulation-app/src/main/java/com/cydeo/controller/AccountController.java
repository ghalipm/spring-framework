package com.cydeo.controller;

import com.cydeo.enums.AccountType;
import com.cydeo.model.Account;
import com.cydeo.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;

/**
 * @author ghalipm on 9/23/2023
 * @project bank-simulation-app
 */
@Controller
//@RequestMapping("/")
    // @RequestMapping("/")  is optional or not needed
    // unless there is a common end point for all methods
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @GetMapping("/index")
    public String allAccounts(Model model) {
        model.addAttribute("accounts", accountService.listAllAccount());
        return "account/index";
    }

    @GetMapping("/create-form")
    public String createForm(Model model) {
        //need an empty account object to hold data
        model.addAttribute("account", Account.builder().build());
        //need to provide accountType enum values to the view page
        model.addAttribute("accountTypes", AccountType.values());

        return "account/create-account";
    }

    // create method to capture information from the form UI
    // print the info on console
    // trigger createNewAccount method from service, based on user input
    //redirect to the index page
    @PostMapping("/create")
    //public String createAccount(@ModelAttribute("account") Account account) {
    public String createAccount(Account account) {
        System.out.println("account = " + account);
        //accountService.createNewAccount(account.getBalance(), account.getCreationDate(), account.getAccountType(), account.getUserId());
        accountService.createNewAccount(account.getBalance(), new Date(), account.getAccountType(), account.getUserId());

        return "redirect:/index";
    }

    @PostMapping("/delete")
    public String deleteAccount(Account account) {
        System.out.println("account = " + account);
        accountService.deleteAccount(account);

        return "redirect:/index";
    }




}
