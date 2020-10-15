package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {

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
        if ("M".equals(command)) {
            move();
        } else if ("L".equals(command)) {
            turnLeft();
        }
    }

    private void move() {
        if ("N".equals(heading)) {
            y++;
        } else if ("S".equals(heading)) {
            y--;
        } else if ("E".equals(heading)) {
            x++;
        } else if ("W".equals(heading)) {
            x--;
        }
    }

    private void turnLeft() {
        if ("N".equals(heading)) {
            heading = "W";
        } else if ("S".equals(heading)) {
            heading = "E";
        } else if ("E".equals(heading)) {
            heading = "N";
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
