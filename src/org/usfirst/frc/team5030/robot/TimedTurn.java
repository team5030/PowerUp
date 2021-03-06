package org.usfirst.frc.team5030.robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class TimedTurn extends Command {
	
	private boolean Finished = false;
	private double speed;
	private double time;
	private Timer timer = new Timer();
	
	public TimedTurn(double Speed, double Time)
	{
		speed = Speed;
		time = Time;
		
	}

	protected void initialize()
	{
		timer.reset();
		timer.start();
		
	}
	
	protected void execute()
	{
		if(timer.get() < time)
		{	
			Robot.drivetrainSubsystem.ArcadeDrive(0, speed);
			Finished = false;
		}
		else
		{
			Finished = true;
		} 
	}
	
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return Finished;
	}
	
	protected void end()
	{
		Robot.drivetrainSubsystem.AllStop();
		Robot.drivetrainSubsystem.EncReset();
	}

	protected void interrupted()
	{
		end();
	}
}
