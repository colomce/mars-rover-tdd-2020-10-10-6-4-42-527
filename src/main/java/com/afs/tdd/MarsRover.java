package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {

    private static final String MOVE = "M";
    private static final String LEFT = "L";
    private static final String RIGHT = "R";
    private static final String NORTH = "N";
    private static final String SOUTH = "S";
    private int x;
    private int y;
    private String heading;

    public MarsRover(int x, int y, String heading) {
        this.x = x;
        this.y = y;
        this.heading = heading;
    }

    public void runActions(String commands) {
        Arrays.stream(commands.split("")).forEach(this::runAction);
    }

    private void runAction(String command) {
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
        } else if ("E".equals(heading)) {
            x++;
        } else if ("W".equals(heading)) {
            x--;
        }
    }

    private void turnLeft() {
        if (NORTH.equals(heading)) {
            heading = "W";
        } else if (SOUTH.equals(heading)) {
            heading = "E";
        } else if ("E".equals(heading)) {
            heading = NORTH;
        } else if ("W".equals(heading)) {
            heading = SOUTH;
        }
    }

    private void turnRight() {
        if (NORTH.equals(heading)) {
            heading = "E";
        } else if (SOUTH.equals(heading)) {
            heading = "W";
        } else if ("E".equals(heading)) {
            heading = SOUTH;
        } else if ("W".equals(heading)) {
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
