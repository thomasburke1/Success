package org.usfirst.frc.team6022.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    final Joystick joystick = new Joystick(0);
	public Joystick getJoystick()
	{
		return joystick;
	}
    // Button button = new JoystickButton(stick, buttonNumber);
}