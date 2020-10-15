package com.afs.tdd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MarsRover {

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
    private List<String> validCommands = Arrays.asList(MOVE, LEFT, RIGHT);

    public MarsRover(int x, int y, String heading) {
        this.x = x;
        this.y = y;
        this.heading = heading;
    }

    public void runCommands(String commands) {
        List<String> commandList = Arrays.stream(commands.split("")).collect(Collectors.toList());
        validateCommands(commandList);
        runEachCommand(commandList);
    }

    private void validateCommands(List<String> commandList) {
        boolean hasInvalidCommand = commandList.stream()
                .anyMatch(command -> !validCommands.contains(command));
        if (hasInvalidCommand) {
            throw new CommandNotDefinedException();
        }
    }

    private void runEachCommand(List<String> commandList) {
        commandList.forEach(this::runCommand);
    }

    private void runCommand(String command) {
        if (MOVE.equals(command)) {
            move();
        } else if (LEFT.equals(command)) {
            turnLeft();
        } else if (RIGHT.equals(command)) {
            turnRight();
        }
    }

    private void move() {
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

    private void turnLeft() {
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

    private void turnRight() {
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
}
