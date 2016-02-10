package org.usfirst.frc.team6022.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team6022.robot.commands.DriveWithJoystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    final Joystick joystick = new Joystick(0);
	public Joystick getJoystick()
	{
		return joystick;
	}
    // Button button = new JoystickButton(stick, buttonNumber);
}