
package org.usfirst.frc.team6022.robot.subsystems;

import org.usfirst.frc.team6022.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
	static RobotDrive drive = new RobotDrive(0,1,2,3); //4 motor drive
	
	public DriveTrain()
	{
		super();
	}
	public void initDefaultCommand () {
		setDefaultCommand (new DriveWithJoystick()) ;
	}

	public void driveWithJoystick (Joystick joystick){
		drive.arcadeDrive(joystick);
	}
	
	
}

