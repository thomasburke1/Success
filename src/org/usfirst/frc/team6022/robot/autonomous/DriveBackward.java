package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.Robot;


import edu.wpi.first.wpilibj.command.Command;

public class DriveBackward extends Command {

	private double Time;
	private double Speed;
	
	public DriveBackward(double inputSpeed, double inputTime)
	{
		requires(Robot.driveTrain);
		Speed = -inputSpeed;
		Time = inputTime;
	}
	
	protected void initialize()
	{
		Robot.driveTrain.DriveBackward(Speed);
		setTimeout(Time);
	}
	
	protected void execute()
	{
		Robot.driveTrain.DriveBackward(Speed);
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

