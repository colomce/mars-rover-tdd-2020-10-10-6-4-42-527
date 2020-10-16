package com.afs.tdd;

import com.afs.tdd.commands.ICommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ControlCenter {
    private List<ICommand> commands = new ArrayList<>();

    public ControlCenter(ICommand ... commands) {
        this.commands.addAll(Arrays.asList(commands));
    }

    public List<ICommand> send() {
        return commands;
    }

    public List<ICommand> rollback() {
        Collections.reverse(commands);
        return commands;
    }

    public void removeCommand(List<ICommand> invalidCommands) {
        commands.removeIf(invalidCommands::contains);
    }
}
