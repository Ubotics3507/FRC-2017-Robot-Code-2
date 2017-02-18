package org.usfirst.frc.team3507.robot.commands;

import org.usfirst.frc.team3507.robot.Robot;

import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.command.Command;

public class FlywheelCMD extends Command {
	
	Preferences prefs = Preferences.getInstance();
	
	public FlywheelCMD () {
		requires(Robot.flywheel);
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void execute() {
		
		Robot.flywheel.go(prefs.getDouble("Flywheel Speed", .5));
	}
	
	protected void end() {
		Robot.flywheel.stop();
	}
	protected void interrupted() {
		end();
	}
	
}
