package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.Robot;




import edu.wpi.first.wpilibj.command.Command;

public class DriveForward extends Command {

	private double Time;
	private double Speed;
	
	public DriveForward(double inputSpeed, double inputTime)
	{
		requires(Robot.driveTrain);
		Speed = inputSpeed;
		Time = inputTime;
	}
	
	protected void initialize()
	{
		Robot.driveTrain.DriveForward(Speed);
		setTimeout(Time);
	}
	
	protected void execute()
	{
		Robot.driveTrain.DriveForward(Speed);
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


	