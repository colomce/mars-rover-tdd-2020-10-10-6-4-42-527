package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DemoTest {
    @Test
    void should_x_0_y_1_heading_N_when_runCommands_given_x_0_y_0_heading_N_commands_M() {
        //given
        String commands = "M";
        MarsRover rover = new MarsRover(0, 0, "N");

        //when
        rover.runCommands(commands);

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(1, rover.getLocationY());
        assertEquals("N", rover.getHeading());
    }

    @Test
    void should_x_0_y_neg1_heading_S_when_runCommands_given_x_0_y_0_heading_S_commands_M() {
        //given
        String commands = "M";
        MarsRover rover = new MarsRover(0, 0, "S");

        //when
        rover.runCommands(commands);

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(-1, rover.getLocationY());
        assertEquals("S", rover.getHeading());
    }

    @Test
    void should_x_1_y_0_heading_E_when_runCommands_given_x_0_y_0_heading_E_commands_M() {
        //given
        String commands = "M";
        MarsRover rover = new MarsRover(0, 0, "E");

        //when
        rover.runCommands(commands);

        //then
        assertEquals(1, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("E", rover.getHeading());
    }

    @Test
    void should_x_neg1_y_0_heading_W_when_runCommands_given_x_0_y_0_heading_W_commands_M() {
        //given
        String commands = "M";
        MarsRover rover = new MarsRover(0, 0, "W");

        //when
        rover.runCommands(commands);

        //then
        assertEquals(-1, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("W", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_W_when_runCommands_given_x_0_y_0_heading_N_commands_L() {
        //given
        String commands = "L";
        MarsRover rover = new MarsRover(0, 0, "N");

        //when
        rover.runCommands(commands);

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("W", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_E_when_runCommands_given_x_0_y_0_heading_S_commands_L() {
        //given
        String commands = "L";
        MarsRover rover = new MarsRover(0, 0, "S");

        //when
        rover.runCommands(commands);

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("E", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_N_when_runCommands_given_x_0_y_0_heading_E_commands_L() {
        //given
        String commands = "L";
        MarsRover rover = new MarsRover(0, 0, "E");

        //when
        rover.runCommands(commands);

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("N", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_S_when_runCommands_given_x_0_y_0_heading_W_commands_L() {
        //given
        String commands = "L";
        MarsRover rover = new MarsRover(0, 0, "W");

        //when
        rover.runCommands(commands);

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("S", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_E_when_runCommands_given_x_0_y_0_heading_N_commands_R() {
        //given
        String commands = "R";
        MarsRover rover = new MarsRover(0, 0, "N");

        //when
        rover.runCommands(commands);

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("E", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_W_when_runCommands_given_x_0_y_0_heading_S_commands_R() {
        //given
        String commands = "R";
        MarsRover rover = new MarsRover(0, 0, "S");

        //when
        rover.runCommands(commands);

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("W", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_S_when_runCommands_given_x_0_y_0_heading_E_commands_R() {
        //given
        String commands = "R";
        MarsRover rover = new MarsRover(0, 0, "E");

        //when
        rover.runCommands(commands);

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("S", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_N_when_runCommands_given_x_0_y_0_heading_W_commands_R() {
        //given
        String commands = "R";
        MarsRover rover = new MarsRover(0, 0, "W");

        //when
        rover.runCommands(commands);

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("N", rover.getHeading());
    }

    @Test
    void should_throw_CommandNotDefinedException_when_runActions_given_x_0_y_0_heading_N_commands_F() {
        //given
        String commands = "F";
        MarsRover rover = new MarsRover(0, 0, "N");

        assertThrows(CommandNotDefinedException.class, () -> {
            //when
            rover.runCommands(commands);
        });

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("N", rover.getHeading());
    }

    @Test
    void should_x_neg1_y_1_heading_N_when_runCommands_given_x_0_y_0_heading_N_commands_MLMR() {
        //given
        String commands = "MLMR";
        MarsRover rover = new MarsRover(0, 0, "N");

        //when
        rover.runCommands(commands);

        //then
        assertEquals(-1, rover.getLocationX());
        assertEquals(1, rover.getLocationY());
        assertEquals("N", rover.getHeading());
    }
}
