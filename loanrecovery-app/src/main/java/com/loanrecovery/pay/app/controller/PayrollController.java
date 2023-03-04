package com.loanrecovery.pay.app.controller;

import com.loanrecovery.pay.app.service.PayrollService;
import com.loanrecovery.pay.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class PayrollController {

    @Autowired
    private PayrollService payrollService;


}
