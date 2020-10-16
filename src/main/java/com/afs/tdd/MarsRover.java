package com.afs.tdd;

import com.afs.tdd.commands.ICommand;
import com.afs.tdd.commands.Move;
import com.afs.tdd.commands.TurnLeft;
import com.afs.tdd.commands.TurnRight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.afs.tdd.Directions.EAST;
import static com.afs.tdd.Directions.NORTH;
import static com.afs.tdd.Directions.SOUTH;
import static com.afs.tdd.Directions.WEST;

public class MarsRover implements IExplorationDevice {
    private Location location;
    private Directions heading;

    private List<Class> validCommands = Arrays.asList(Move.class, TurnLeft.class, TurnRight.class);
    private List<ICommand> invalidCommands = new ArrayList<>();

    public MarsRover(Location location, Directions heading) {
        this.location = location;
        this.heading = heading;
    }

    public void runCommands(List<ICommand> commands) {
        runEachCommand(commands);
    }

    private void runEachCommand(List<ICommand> commandList) {
        commandList.forEach(iCommand -> {
            if (!validCommands.contains(iCommand.getClass())) {
                invalidCommands.add(iCommand);
                throw new CommandNotDefinedException();
            }
            iCommand.execute();
        });
    }

    public void rollbackEachCommand(List<ICommand> commandList) {
        commandList.forEach(ICommand::unExecute);
    }

    @Override
    public void moveForward() {
        int x = this.location.getX();
        int y = this.location.getY();
        if (NORTH.equals(heading)) {
            this.location.setY(++y);
        } else if (SOUTH.equals(heading)) {
            this.location.setY(--y);
        } else if (EAST.equals(heading)) {
            this.location.setX(++x);
        } else if (WEST.equals(heading)) {
            this.location.setX(--x);
        }
    }

    @Override
    public void moveBackwards() {
        int x = this.location.getX();
        int y = this.location.getY();

        if (NORTH.equals(heading)) {
            this.location.setY(--y);
        } else if (SOUTH.equals(heading)) {
            this.location.setY(++y);
        } else if (EAST.equals(heading)) {
            this.location.setX(--x);
        } else if (WEST.equals(heading)) {
            this.location.setX(++x);
        }
    }

    @Override
    public void turnLeft() {
        if (NORTH.equals(heading)) {
            heading = WEST;
        } else if (SOUTH.equals(heading)) {
            heading = EAST;
        } else if (EAST.equals(heading)) {
            heading = NORTH;
        } else if (WEST.equals(heading)) {
            heading = SOUTH;
        }
    }

    @Override
    public void turnRight() {
        if (NORTH.equals(heading)) {
            heading = EAST;
        } else if (SOUTH.equals(heading)) {
            heading = WEST;
        } else if (EAST.equals(heading)) {
            heading = SOUTH;
        } else if (WEST.equals(heading)) {
            heading = NORTH;
        }
    }

    public int getLocationX() {
        return this.location.getX();
    }

    public int getLocationY() {
        return this.location.getY();
    }

    public Directions getHeading() {
        return heading;
    }

    public List<ICommand> getInvalidCommands() {
        return invalidCommands;
    }
}
