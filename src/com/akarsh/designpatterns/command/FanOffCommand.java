package com.akarsh.designpatterns.command;

import com.akarsh.designpatterns.command.receivers.Fan;

public class FanOffCommand implements Command{
    private final Fan fan;

    private FanOffCommand(final Fan fan) {
        this.fan = fan;
    }

    public static FanOffCommand getFanOffCommand(final Fan fan) {
        if(fan == null) throw new IllegalArgumentException("fan must not be null");
        return new FanOffCommand(fan);
    }

    /**
     * calls on method off the fan object;
     */
    @Override
    public void run() {
        this.fan.off();
    }
}
