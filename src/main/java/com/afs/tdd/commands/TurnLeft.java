package com.afs.tdd.commands;

import com.afs.tdd.IExplorationDevice;

public class TurnLeft implements ICommand {
    private IExplorationDevice explorationDevice;

    public TurnLeft(IExplorationDevice explorationDevice) {
        this.explorationDevice = explorationDevice;
    }

    @Override
    public void execute() {
        this.explorationDevice.turnLeft();
    }

    @Override
    public void unExecute() {
        this.explorationDevice.turnRight();
    }
}
