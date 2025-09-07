package com.akarsh.designpatterns;

import java.math.BigDecimal;

public class Account {

    private final Long id;
    private BigDecimal amount;

    public Account(Long Id, BigDecimal amount) {
        this.id = Id;
        this.amount = amount;
    }

    public void withdraw(BigDecimal amt) {
        if(this.amount.compareTo(amt) < 0) return;

        this.amount = this.amount.subtract(amt);
    }

    public void deposit(BigDecimal amt) {
        this.amount = this.amount.add(amt);
    }


    public Long getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
