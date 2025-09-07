package com.akarsh.designpatterns;

import java.math.BigDecimal;

public class Test2 {

    public static void main(String[] args) {
        Account account = new Account(1l, BigDecimal.valueOf(1000l));

        Transaction tx = new Deposit();
        tx.execute(account, BigDecimal.valueOf(100l));
        System.out.println(account.getAmount());

        tx = new Withdraw();
        tx.execute(account, BigDecimal.valueOf(500l));
        System.out.println(account.getAmount());

        tx = new Withdraw();
        tx.execute(account, BigDecimal.valueOf(1000l));
        System.out.println(account.getAmount());

    }
}
