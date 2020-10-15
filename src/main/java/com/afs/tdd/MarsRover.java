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
        if("M".equals(command)) {
            move();
        }
    }

    private void move() {
        if("N".equals(heading)) {
            y++;
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
