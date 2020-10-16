package com.afs.tdd.commands;

import com.afs.tdd.IExplorationDevice;

public class TurnRight implements ICommand {
    private IExplorationDevice explorationDevice;

    public TurnRight(IExplorationDevice explorationDevice) {
        this.explorationDevice = explorationDevice;
    }

    @Override
    public void execute() {
        this.explorationDevice.turnRight();
    }

    @Override
    public void unExecute() {
        this.explorationDevice.turnLeft();
    }
}
