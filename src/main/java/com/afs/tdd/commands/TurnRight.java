package com.afs.tdd.commands;

import com.afs.tdd.ExplorationDevice;

public class TurnRight implements ICommand {
    private ExplorationDevice explorationDevice;

    public TurnRight(ExplorationDevice explorationDevice) {
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
