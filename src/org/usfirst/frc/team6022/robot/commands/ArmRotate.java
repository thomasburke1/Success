package org.usfirst.frc.team6022.robot.commands;

import org.usfirst.frc.team6022.robot.Robot;


import edu.wpi.first.wpilibj.command.Command;

public class ArmRotate extends Command {
	
	public ArmRotate() {
		requires(Robot.arm);
	}
	

	protected void initialize () {
	}
	
	protected void execute () {
		Robot.arm.ArmRotate(Robot.oi.getJoystick());
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
		
	}


	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}
}

