package com.afs.tdd.commands;

import com.afs.tdd.ExplorationDevice;

public class TurnLeft implements ICommand {
    private ExplorationDevice explorationDevice;

    public TurnLeft(ExplorationDevice explorationDevice) {
        this.explorationDevice = explorationDevice;
    }

    @Override
    public void execute() {
        this.explorationDevice.turnLeft();
    }
}
