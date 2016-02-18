package org.usfirst.frc.team6022.robot.limit;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Limit extends Subsystem {
    public void Arm() {
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