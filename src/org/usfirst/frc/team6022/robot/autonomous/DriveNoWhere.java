package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveNoWhere extends Command {
	
	private double Time;
	public DriveNoWhere(double inputTime)
    {
        requires(Robot.driveTrain);
        Time = inputTime;
    }

    protected void initialize()
    {
    	Robot.driveTrain.DriveNoWhere();
    	setTimeout(Time);
    }

    protected void execute()
    {
    	Robot.driveTrain.DriveNoWhere();
    }

    protected boolean isFinished()
    {
        return isTimedOut();
    }

    protected void end()
    {
    	Robot.driveTrain.DriveNoWhere();
    }
	
	protected void interrupted()
	{
	}
}