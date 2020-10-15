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

    @Test
    void should_x_1_y_0_heading_E_when_runActions_given_x_0_y_0_heading_E_commands_M() {
        //given
        String commands = "M";
        MarsRover rover = new MarsRover(0,0,"E");

        //when
        rover.runActions(commands);

        //then
        assertEquals(1, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("E", rover.getHeading());
    }
}
