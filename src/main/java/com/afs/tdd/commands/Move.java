package com.afs.tdd.commands;

import com.afs.tdd.ExplorationDevice;

public class Move implements ICommand {
    private ExplorationDevice explorationDevice;

    public Move(ExplorationDevice explorationDevice) {
        this.explorationDevice = explorationDevice;
    }

    @Override
    public void execute() {
        this.explorationDevice.move();
    }

    @Override
    public void unExecute() {
        this.explorationDevice.moveBackwards();
    }
}
