//Subsystem of the Arm

package org.usfirst.frc.team6022.robot.subsystems;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {
	
	static RobotDrive drive = new RobotDrive (0,1);
			
	public Arm ()
	{
		super();
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand (new org.usfirst.frc.team6022.robot.commands.ArmRotate()) ;
	}
	@SuppressWarnings("null")
	public void ArmRotate (Joystick joystick) {
		GenericHID stick = null;
		drive.arcadeDrive(stick(stick.getY(), (stick.getX())));
		
	}	
		public void MakeItMove(double inputSpeed)
		{
			drive.arcadeDrive(inputSpeed,0);
		}
		
		public void MoveNoWhere()
		{
			drive.arcadeDrive(0,0);
		}
	private GenericHID stick(double y, double d) {
		return null;
	}
}