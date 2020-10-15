package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_x_0_y_1_heading_N_when_runActions_given_x_0_y_0_heading_N_commands_M() {
        //given
        String commands = "M";
        MarsRover rover = new MarsRover(0,0,"N");

        //when
        rover.runActions(commands);

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(1, rover.getLocationY());
        assertEquals("N", rover.getHeading());
    }

    @Test
    void should_x_0_y_neg1_heading_S_when_runActions_given_x_0_y_0_heading_S_commands_M() {
        //given
        String commands = "M";
        MarsRover rover = new MarsRover(0,0,"S");

        //when
        rover.runActions(commands);

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(-1, rover.getLocationY());
        assertEquals("S", rover.getHeading());
    }
}
