package com.afs.tdd;

import com.afs.tdd.commands.ICommand;

import java.util.Arrays;
import java.util.List;

public class ControlCenter {
    private List<ICommand> commands;

    public ControlCenter(ICommand... commands) {
        this.commands = Arrays.asList(commands);
    }

    public List<ICommand> send() {
        return commands;
    }
}
