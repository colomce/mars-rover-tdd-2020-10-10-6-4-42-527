package com.afs.tdd.commands;

import com.afs.tdd.ExplorationDevice;

public class Jump implements ICommand {
    private ExplorationDevice explorationDevice;

    public Jump(ExplorationDevice explorationDevice) {
        this.explorationDevice = explorationDevice;
    }

    @Override
    public void execute() {
        System.out.println("Jumping");
    }
}
