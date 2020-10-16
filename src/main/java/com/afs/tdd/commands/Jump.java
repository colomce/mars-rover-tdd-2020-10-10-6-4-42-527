package com.afs.tdd.commands;

import com.afs.tdd.IExplorationDevice;

public class Jump implements ICommand {
    private IExplorationDevice explorationDevice;

    public Jump(IExplorationDevice explorationDevice) {
        this.explorationDevice = explorationDevice;
    }

    @Override
    public void execute() {
        System.out.println("Jumping");
    }

    @Override
    public void unExecute() {
        System.out.println("Descending");
    }
}
