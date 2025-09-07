package com.akarsh.designpatterns;

import java.math.BigDecimal;

public class Deposit implements Transaction{

    @Override
    public void execute(Account account, BigDecimal amount) {
        account.deposit(amount);
    }
}
