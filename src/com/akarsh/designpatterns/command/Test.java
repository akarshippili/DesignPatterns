package com.akarsh.designpatterns.command;

import com.akarsh.designpatterns.command.receivers.Fan;

public class Test {
    public static void main(String[] args) {
        RemoteController remoteController = RemoteController.getRemoteController(2);

        Fan fan = new Fan();
        remoteController.setCommandAtIndex(0, fan::on);
        remoteController.setCommandAtIndex(1, fan::off);

//        Command fanOnCommand = FanOnCommand.getFanOnCommand(fan);
//        Command fanOffCommand = FanOffCommand.getFanOffCommand(fan);
//        remoteController.setCommandAtIndex(0, fanOnCommand);

//        remoteController.setCommandAtIndex(1, fanOffCommand);

        remoteController.executeCommandAtIndex(0);
        remoteController.executeCommandAtIndex(1);
    }
}
