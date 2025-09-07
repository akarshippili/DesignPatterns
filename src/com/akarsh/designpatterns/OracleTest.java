package com.akarsh.designpatterns;

import java.math.BigDecimal;

public class OracleTest {

    public double rootOf(double a, double b, int precision){
//        if(b == 0)


        double x0 = a / b;
        double prev = x0;
        double cur;

        while(true) {
            cur = (1 / b) * ((b-1) * x0  + (a / (Math.pow(prev, b-1))));
            prev = cur;

            if(Math.abs(prev - cur) < 0.01) break;
        }

        return cur;
    }
}
