package com.salafiaji.thetrustbank.controller;

import com.salafiaji.thetrustbank.dto.*;
import com.salafiaji.thetrustbank.service.impl.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
@Tag(name = "User Account Management APIs")
public class UserController {

    @Autowired
    UserService userService;

    @Operation(summary = "Create new User Account", description = "Creating a new user and assigning an account ID")
    @ApiResponse(responseCode = "201", description = "Http status 201 CREATED")
    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

    @PostMapping("login")
    public BankResponse login(@RequestBody LoginDto loginDto){
        return userService.login(loginDto);
    }

    @Operation(summary = "Balance Enquiry", description = "Given an account number, check how much the user has")
    @ApiResponse(responseCode = "200", description = "Http status 200 SUCCESS")
    @GetMapping("balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request) {
        return userService.balanceEnquiry(request);
    }

    @GetMapping("nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request) {
        return userService.nameEnquiry(request);
    }


    @PostMapping("credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request) {
        return userService.creditAccount(request);
    }

    @PostMapping("debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request) {
        return userService.debitAccount(request);
    }

    @PostMapping("transfer")
    public BankResponse transfer(@RequestBody TransferRequest request) {
        return userService.transfer(request);
    }
}
