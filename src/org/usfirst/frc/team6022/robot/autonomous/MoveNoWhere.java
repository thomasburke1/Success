package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class MoveNoWhere extends Command {
	
	private double Time;
	public MoveNoWhere(double inputTime)
    {
        requires(Robot.arm);
        Time = inputTime;
    }

    protected void initialize()
    {
    	Robot.arm.MoveNoWhere();
    	setTimeout(Time);
    }

    protected void execute()
    {
    	Robot.arm.MoveNoWhere();
    }

    protected boolean isFinished()
    {
        return isTimedOut();
    }

    protected void end()
    {
    	Robot.arm.MoveNoWhere();
    }
	
	protected void interrupted()
	{
	}
}