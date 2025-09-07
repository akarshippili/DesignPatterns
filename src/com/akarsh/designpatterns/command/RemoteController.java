package com.akarsh.designpatterns.command;

public class RemoteController {
    private final Command[] commands;

    private RemoteController(int capacity) {
        this.commands = new Command[capacity];
    }

    public static RemoteController getRemoteController(int capacity) {
        return new RemoteController(capacity);
    }

    public void setCommandAtIndex(int index, Command command) {
        if (index >= commands.length) throw new IllegalArgumentException("index out of range");
        if(command == null) throw new IllegalArgumentException("command must not be null");

        commands[index] = command;
    }

    public void executeCommandAtIndex(int index){
        if(index >= commands.length) throw new IllegalArgumentException("index out of");
        commands[index].run();
    }
}
