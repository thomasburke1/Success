package org.usfirst.frc.team6022.robot.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous extends CommandGroup {

	public Autonomous()
	{
		addSequential (new DriveNoWhere(0));
		addSequential (new DriveNoWhere(0));
		addSequential (new DriveForward(-.5, 1));
		addSequential (new DriveNoWhere(0));
		addSequential (new DriveBackward(.5, 1));
		addSequential (new MakeItMove(-.005, 1));
		addSequential (new MoveNoWhere(0));
	}
}