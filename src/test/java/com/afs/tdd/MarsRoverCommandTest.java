package com.afs.tdd;

import com.afs.tdd.commands.Jump;
import com.afs.tdd.commands.Move;
import com.afs.tdd.commands.TurnLeft;
import com.afs.tdd.commands.TurnRight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarsRoverCommandTest {
    @Test
    void should_x_0_y_1_heading_N_when_runCommands_given_x_0_y_0_heading_N_commands_M() {
        //given
        MarsRover rover = new MarsRover(0, 0, "N");
        ControlCenter controlCenter = new ControlCenter(new Move(rover));

        //when
        rover.runCommands(controlCenter.send());

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(1, rover.getLocationY());
        assertEquals("N", rover.getHeading());
    }

    @Test
    void should_x_0_y_neg1_heading_S_when_runCommands_given_x_0_y_0_heading_S_commands_M() {
        //given
        MarsRover rover = new MarsRover(0, 0, "S");
        ControlCenter controlCenter = new ControlCenter(new Move(rover));

        //when
        rover.runCommands(controlCenter.send());

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(-1, rover.getLocationY());
        assertEquals("S", rover.getHeading());
    }

    @Test
    void should_x_1_y_0_heading_E_when_runCommands_given_x_0_y_0_heading_E_commands_M() {
        //given
        MarsRover rover = new MarsRover(0, 0, "E");
        ControlCenter controlCenter = new ControlCenter(new Move(rover));

        //when
        rover.runCommands(controlCenter.send());

        //then
        assertEquals(1, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("E", rover.getHeading());
    }

    @Test
    void should_x_neg1_y_0_heading_W_when_runCommands_given_x_0_y_0_heading_W_commands_M() {
        //given
        MarsRover rover = new MarsRover(0, 0, "W");
        ControlCenter controlCenter = new ControlCenter(new Move(rover));

        //when
        rover.runCommands(controlCenter.send());

        //then
        assertEquals(-1, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("W", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_W_when_runCommands_given_x_0_y_0_heading_N_commands_L() {
        //given
        MarsRover rover = new MarsRover(0, 0, "N");
        ControlCenter controlCenter = new ControlCenter(new TurnLeft(rover));

        //when
        rover.runCommands(controlCenter.send());

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("W", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_E_when_runCommands_given_x_0_y_0_heading_S_commands_L() {
        //given
        MarsRover rover = new MarsRover(0, 0, "S");
        ControlCenter controlCenter = new ControlCenter(new TurnLeft(rover));

        //when
        rover.runCommands(controlCenter.send());

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("E", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_N_when_runCommands_given_x_0_y_0_heading_E_commands_L() {
        //given
        MarsRover rover = new MarsRover(0, 0, "E");
        ControlCenter controlCenter = new ControlCenter(new TurnLeft(rover));

        //when
        rover.runCommands(controlCenter.send());

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("N", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_S_when_runCommands_given_x_0_y_0_heading_W_commands_L() {
        //given
        MarsRover rover = new MarsRover(0, 0, "W");
        ControlCenter controlCenter = new ControlCenter(new TurnLeft(rover));

        //when
        rover.runCommands(controlCenter.send());

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("S", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_E_when_runCommands_given_x_0_y_0_heading_N_commands_R() {
        //given
        MarsRover rover = new MarsRover(0, 0, "N");
        ControlCenter controlCenter = new ControlCenter(new TurnRight(rover));

        //when
        rover.runCommands(controlCenter.send());

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("E", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_W_when_runCommands_given_x_0_y_0_heading_S_commands_R() {
        //given
        MarsRover rover = new MarsRover(0, 0, "S");
        ControlCenter controlCenter = new ControlCenter(new TurnRight(rover));

        //when
        rover.runCommands(controlCenter.send());

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("W", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_S_when_runCommands_given_x_0_y_0_heading_E_commands_R() {
        //given
        MarsRover rover = new MarsRover(0, 0, "E");
        ControlCenter controlCenter = new ControlCenter(new TurnRight(rover));

        //when
        rover.runCommands(controlCenter.send());

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("S", rover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_N_when_runCommands_given_x_0_y_0_heading_W_commands_R() {
        //given
        MarsRover rover = new MarsRover(0, 0, "W");
        ControlCenter controlCenter = new ControlCenter(new TurnRight(rover));

        //when
        rover.runCommands(controlCenter.send());

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("N", rover.getHeading());
    }

    @Test
    void should_throw_CommandNotDefinedException_when_runActions_given_x_0_y_0_heading_N_commands_F() {
        //given
        MarsRover rover = new MarsRover(0, 0, "N");

        //when
        ControlCenter controlCenter = new ControlCenter(new Jump(rover));

        //then
        assertThrows(CommandNotDefinedException.class, () -> rover.runCommands(controlCenter.send()));
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("N", rover.getHeading());
    }

    @Test
    void should_x_neg1_y_1_heading_N_when_runCommands_given_x_0_y_0_heading_N_commands_MLMR() {
        //given
        MarsRover rover = new MarsRover(0, 0, "N");
        ControlCenter controlCenter = new ControlCenter(
                new Move(rover),
                new TurnLeft(rover),
                new Move(rover),
                new TurnRight(rover));
        //when
        rover.runCommands(controlCenter.send());

        //then
        assertEquals(-1, rover.getLocationX());
        assertEquals(1, rover.getLocationY());
        assertEquals("N", rover.getHeading());
    }

    @Test
    void should_rollback_x_0_y_0_heading_N_when_runCommands_given_x_0_y_0_heading_N_commands_MLMRJ() {
        //given
        MarsRover rover = new MarsRover(0, 0, "N");
        ControlCenter controlCenter = new ControlCenter(
                new Move(rover),
                new TurnLeft(rover),
                new Move(rover),
                new TurnRight(rover),
                new Jump(rover));

        //when
        try {
            rover.runCommands(controlCenter.send());
        } catch (Exception ex) {
            controlCenter.removeCommand(rover.getInvalidCommands());
            rover.rollbackEachCommand(controlCenter.rollback());
        }

        //then
        assertEquals(0, rover.getLocationX());
        assertEquals(0, rover.getLocationY());
        assertEquals("N", rover.getHeading());
    }
}
