package org.usfirst.frc.team1714.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.Relay;
// import java.util.Timer;
// import java.util.TimerTask;
import edu.wpi.first.wpilibj.TalonSRX;



/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */

/* broken, stock timer class doesn't work with roborio

class TransTask extends TimerTask 
{
	Relay lrelay;
	TalonSRX mc1;
	
	boolean forward = true;
	
	TransTask()
	{
		super();
		lrelay = new Relay(0);
		mc1 = new TalonSRX(0);
	}
	
	public void run()
	{
		if(forward)
		{
			System.out.println("running the forward state \n\r");
			mc1.set(0.2);
			lrelay.set(Relay.Value.kOn);
			forward = false;
		}
		else
		{
			System.out.println("running the reverse state \n\r");
			mc1.set(-0.2);
			lrelay.set(Relay.Value.kOff);
			forward = true;
		}
	}
}

*/

public class Robot extends IterativeRobot {
	// Timer transtimer;
	// TransTask mytask;
	long intervallength;
	// boolean test = true;

	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	intervallength = 1000;
    	// transtimer = new Timer();
    	// mytask = new TransTask();   	
    }
    
    /**
     * This function is run once each time the robot enters autonomous mode
     */
    public void autonomousInit() {
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	
    }
    
    /**
     * This function is called once each time the robot enters tele-operated mode
     */
    public void teleopInit(){
    	
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	/*
    	if(test)
    	{
    		transtimer.scheduleAtFixedRate(mytask, 0, timerlength);
    		test = false;
    	}
    	*/
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	LiveWindow.run();
    }
    
}
