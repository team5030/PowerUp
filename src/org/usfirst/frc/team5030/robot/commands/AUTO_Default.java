package org.usfirst.frc.team5030.robot.commands;

import org.usfirst.frc.team5030.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AUTO_Default extends Command {

    public AUTO_Default() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drivetrainSubsystem);
        requires(Robot.intakeSubsytem);
        requires(Robot.climberSubsytem);
        requires(Robot.elevatorSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrainSubsystem.AllStop();
    	Robot.intakeSubsytem.IntakeStop();
    	Robot.climberSubsytem.ClimberStop();
    	Robot.elevatorSubsystem.elevatorStop();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
