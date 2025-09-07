package com.akarsh.designpatterns;

import java.math.BigDecimal;

public class Withdraw implements Transaction{
    @Override
    public void execute(Account account, BigDecimal amount) {
        account.withdraw(amount);
    }
}
