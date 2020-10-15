package com.afs.tdd;

import com.afs.tdd.commands.ICommand;
import com.afs.tdd.commands.Move;
import com.afs.tdd.commands.TurnLeft;
import com.afs.tdd.commands.TurnRight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MarsRover implements ExplorationDevice {

    private static final String MOVE = "M";
    private static final String LEFT = "L";
    private static final String RIGHT = "R";
    private static final String NORTH = "N";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private static final String WEST = "W";
    private int x;
    private int y;
    private String heading;

    private List<Class> validCommands = Arrays.asList(Move.class, TurnLeft.class, TurnRight.class);
    private List<ICommand> invalidCommands = new ArrayList<>();

    public MarsRover(int x, int y, String heading) {
        this.x = x;
        this.y = y;
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

    public void move() {
        if (NORTH.equals(heading)) {
            y++;
        } else if (SOUTH.equals(heading)) {
            y--;
        } else if (EAST.equals(heading)) {
            x++;
        } else if (WEST.equals(heading)) {
            x--;
        }
    }

    @Override
    public void moveBackwards() {
        if (NORTH.equals(heading)) {
            y--;
        } else if (SOUTH.equals(heading)) {
            y++;
        } else if (EAST.equals(heading)) {
            x--;
        } else if (WEST.equals(heading)) {
            x++;
        }
    }

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
        return x;
    }

    public int getLocationY() {
        return y;
    }

    public String getHeading() {
        return heading;
    }

    public List<ICommand> getInvalidCommands() {
        return invalidCommands;
    }
}
