package org.usfirst.frc.team6022.robot.subsystems;

import org.usfirst.frc.team6022.robot.subsystems;

public class TestEncoder extends Subsystem {
    public Arm() {
    }

    protected void initialize() {
        arm.arm();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return arm.isSwitchSet();
    }

    protected void end() {
        arm.armStop();
    }

    protected void interrupted() {
        end();
    }
}