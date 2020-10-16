package com.afs.tdd.commands;

import com.afs.tdd.IExplorationDevice;

public class Move implements ICommand {
    private IExplorationDevice explorationDevice;

    public Move(IExplorationDevice explorationDevice) {
        this.explorationDevice = explorationDevice;
    }

    @Override
    public void execute() {
        this.explorationDevice.moveForward();
    }

    @Override
    public void unExecute() {
        this.explorationDevice.moveBackwards();
    }
}
