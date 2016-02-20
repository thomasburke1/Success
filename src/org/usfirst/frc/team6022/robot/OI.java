package org.usfirst.frc.team6022.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    final Joystick joystick = new Joystick(0);
    
    final Joystick joystick1 = new Joystick(1);
    
    public OI() {
    	//button.whenPressed(new )
    }
    
	public Joystick getJoystick()
	{
		return joystick;
	}
	
	public Joystick getJoystick1()
	{
		return joystick1;
	}
	
    // Button button = new JoystickButton(stick, buttonNumber);
}