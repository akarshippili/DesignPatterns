package com.akarsh.designpatterns.command;

import com.akarsh.designpatterns.command.receivers.Fan;

public class FanOnCommand implements Command{
    private final Fan fan;

    private FanOnCommand(final Fan fan) {
        this.fan = fan;
    }

    public static FanOnCommand getFanOnCommand(final Fan fan) {
        if(fan == null) throw new IllegalArgumentException("fan must not be null");
        return new FanOnCommand(fan);
    }

    /**
     * calls on method on the fan object;
     */
    @Override
    public void run() {
        this.fan.on();
    }
}
