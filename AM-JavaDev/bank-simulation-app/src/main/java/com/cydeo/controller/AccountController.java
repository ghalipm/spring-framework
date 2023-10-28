package com.cydeo.controller;

import com.cydeo.enums.AccountType;
import com.cydeo.model.Account;
import com.cydeo.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.UUID;

/**
 * @author ghalipm on 9/23/2023
 * @project bank-simulation-app
 */
@Controller
//@RequestMapping("/")
    // @RequestMapping("/")  is optional or not needed
    // unless there is a common end point for all methods
public class AccountController {

    private static final String REDIRECT_TO_INDEX = "redirect:/index";

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
    public String createAccount(@Valid @ModelAttribute("account") Account account, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("accountTypes", AccountType.values());
            return "account/create-account";
        }

        System.out.println("account = " + account);
        accountService.createNewAccount(account.getBalance(), new Date(), account.getAccountType(), account.getUserId());
        return REDIRECT_TO_INDEX;
    }

    //1. need to get the account id and provide it to the controller
    //2. need to get the account for the id
    // 3. update account status to inactive/deleted
    @GetMapping("/delete/{id}")
    public String deleteAccount(@PathVariable("id") UUID id) {
        accountService.deleteAccount(id);
        return REDIRECT_TO_INDEX;
    }

    @GetMapping("/activate/{id}")
    public String activateAccount(@PathVariable("id") UUID id) {
        accountService.activateAccount(id);
        return REDIRECT_TO_INDEX;
    }



}
