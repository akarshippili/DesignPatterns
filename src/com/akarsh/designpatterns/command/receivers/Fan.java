package com.akarsh.designpatterns.command.receivers;

public class Fan {
    public void on() {
        System.out.println("fan is turned on");
    }
    public void off() {
        System.out.println("fan is turned off");
    }
}
