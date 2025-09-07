package com.akarsh.designpatterns;

import java.math.BigDecimal;

public interface Transaction {
    public void execute(Account account, BigDecimal amount);
}

