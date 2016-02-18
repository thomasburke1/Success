package org.usfirst.frc.team6022.robot.autonomous;

import org.usfirst.frc.team6022.robot.Robot;




import edu.wpi.first.wpilibj.command.Command;

public class MakeItMove extends Command {

	private double Time;
	private double Speed;
	
	public MakeItMove(double inputSpeed, double inputTime)
	{
		requires(Robot.arm);
		Speed = inputSpeed;
		Time = inputTime;
	}
	
	protected void initialize()
	{
		Robot.arm.MakeItMove(Speed);
		setTimeout(Time);
	}
	
	protected void execute()
	{
		Robot.arm.MakeItMove(Speed);
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
	